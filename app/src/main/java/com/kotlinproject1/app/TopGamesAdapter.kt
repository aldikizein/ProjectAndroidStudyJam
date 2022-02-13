package com.kotlinproject1.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlinproject1.app.databinding.ItemTopgamesBinding

class TopGamesAdapter(
    private val items: MutableList<TopGames> = mutableListOf(),
    private val onItemClickedCallback: OnItemClickedCallback
): RecyclerView.Adapter<TopGamesAdapter.TopGamesViewHolder>() {
    private lateinit var binding: ItemTopgamesBinding

    interface OnItemClickedCallback{
        fun onItemClicked(data: TopGames)
    }

    inner class TopGamesViewHolder(private val binding: ItemTopgamesBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind (data: TopGames){
            with(this.binding){
                tvJudulTopGames.text = data.title
                posterTopGames.setImageResource(R.drawable.ic_baseline_arrow_circle_up_24)
                root.setOnClickListener {
                    onItemClickedCallback.onItemClicked(data)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopGamesViewHolder {
        binding = ItemTopgamesBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return TopGamesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TopGamesViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}
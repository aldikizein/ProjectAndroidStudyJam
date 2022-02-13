package com.kotlinproject1.app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlinproject1.app.databinding.ItemTopgamesBinding

class NewGamesAdapter(
    private val items: List<NewGames>,
    private val onItemClickedCallback: OnItemClickedCallback
): RecyclerView.Adapter<NewGamesAdapter.NewGamesViewHolder>() {
    private lateinit var binding: ItemTopgamesBinding
    inner class NewGamesViewHolder(private val binding:ItemTopgamesBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(data:NewGames ){
            with(this.binding){
                tvJudulTopGames.text = data.title
                posterTopGames.setImageResource(R.drawable.ic_baseline_arrow_circle_up_24)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewGamesViewHolder {
       binding = ItemTopgamesBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return NewGamesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewGamesViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    interface OnItemClickedCallback{
        fun onItemClicked(data: NewGames)
    }
}
package com.kotlinproject1.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlinproject1.app.databinding.FragmentNewGamesBinding
import com.kotlinproject1.app.databinding.FragmentTopGamesBinding

class NewGamesFragment : Fragment() {
    private lateinit var binding: FragmentNewGamesBinding
    private lateinit var newGamesAdapter: NewGamesAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewGamesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        newGamesAdapter = NewGamesAdapter(
            items = DummyData.getNewGames().toMutableList(),
            onItemClickedCallback = object : NewGamesAdapter.OnItemClickedCallback{
                override fun onItemClicked (data: NewGames){
                    DetailActivity.start(requireContext(), data)
                }
            }
        )
        initRecyclerView()

    }

    private fun initRecyclerView() {
        with(binding) {
            rvNewGames.apply{
                adapter = newGamesAdapter
                layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
        }
    }

}


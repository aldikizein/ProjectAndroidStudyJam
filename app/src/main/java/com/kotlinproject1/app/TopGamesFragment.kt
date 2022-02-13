package com.kotlinproject1.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlinproject1.app.databinding.FragmentTopGamesBinding

class TopGamesFragment : Fragment() {
    private lateinit var binding: FragmentTopGamesBinding
    private lateinit var topGamesAdapter: TopGamesAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTopGamesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        topGamesAdapter = TopGamesAdapter(
            items = DummyData.getTopGames().toMutableList(),
            onItemClickedCallback = object : TopGamesAdapter.OnItemClickedCallback {
                override fun onItemClicked(data: TopGames) {
                    DetailActivity.start(requireContext(), data)
                }

            }
        )
        initRecyclerView()

    }

    private fun initRecyclerView() {
        with(binding) {
            rvTopGames.apply {
                adapter = topGamesAdapter
                layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            }
        }
    }
}
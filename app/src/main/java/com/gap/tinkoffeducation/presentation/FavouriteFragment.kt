package com.gap.tinkoffeducation.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gap.tinkoffeducation.databinding.FragmentFavouriteBinding


class FavouriteFragment : Fragment() {
    private val binding: FragmentFavouriteBinding
        get() = _binding ?: throw RuntimeException("FavouriteFragment == null")
    private var _binding: FragmentFavouriteBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavouriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
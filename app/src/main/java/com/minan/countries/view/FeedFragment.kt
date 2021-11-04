package com.minan.countries.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.minan.countries.databinding.FragmentFeedBinding

class FeedFragment : Fragment() {

    private lateinit var binding: FragmentFeedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFeedBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.button.setOnClickListener {
//            val action = FeedFragmentDirections.actionFeedFragmentToCountryFragment()
//            Navigation.findNavController(it).navigate(action)
//        }
    }
}
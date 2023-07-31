package com.example.mimbluassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mimbluassignment.databinding.FragmentSymptomsBinding


class SymptomsFragment : Fragment() {


    private var _binding: FragmentSymptomsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSymptomsBinding.inflate(inflater, container, false)
        goToMatchFragment()
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun goToMatchFragment() {
        binding.buttonShowMatches.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_symptomsFragment_to_matchFragment)
        }
    }
}
package com.example.navgationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgationgraph.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
     private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding= FragmentSecondBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGo1.setOnClickListener { findNavController().navigate(R.id.action_secondFragment_to_firstFragment) }
    }




}
package com.example.navgationgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navgationgraph.databinding.FragmentFirstBinding


//import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment() : Fragment() {

    private lateinit var binding: FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
        }
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnToGo2.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }
        binding.btnToGo3.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
        }
    }

}


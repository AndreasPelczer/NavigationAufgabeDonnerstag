package com.example.navigationsAufgabeDonnerstag.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationdemo.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    private lateinit var binding: FragmentSecondBinding
    private var data: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            data = it.getString("data", "")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("NavigationTest", data)

        binding.SecondWeiterBTN.setOnClickListener {
            val navController = findNavController()
            navController.navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment())
        }
        binding.backButton.setOnClickListener {
            findNavController().popBackStack()
        }

    }
}
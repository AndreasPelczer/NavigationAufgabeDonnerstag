package com.example.navigationsAufgabeDonnerstag.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationsAufgabeDonnerstag.R
import com.example.navigationsAufgabeDonnerstag.R.id.imageView2
import com.example.navigationsAufgabeDonnerstag.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.FirstWeiterBTN.setOnClickListener {
            val navController = findNavController()
            navController.navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment("Hello World!"))
        }
        binding.imageView2.setImageResource(R.drawable.aufkleber1)


    }


}
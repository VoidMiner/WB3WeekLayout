package com.example.wb3weeklayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.wb3weeklayout.databinding.FragmentNavigationBinding



class NavigationFrag : Fragment() {
    private lateinit var binding: FragmentNavigationBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNavigationBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            template1.setOnClickListener() {
                naviButton(R.id.action_navigationFrag_to_template12)
            }

            template2.setOnClickListener() {
                naviButton(R.id.action_navigationFrag_to_template22)
            }
            template3.setOnClickListener() {
                naviButton(R.id.action_navigationFrag_to_template32)
            }
            template4.setOnClickListener() {
                naviButton(R.id.action_navigationFrag_to_template42)
            }

        }


    }
    fun naviButton(action: Int){
        Navigation.findNavController(binding.root).navigate(action)
    }


}
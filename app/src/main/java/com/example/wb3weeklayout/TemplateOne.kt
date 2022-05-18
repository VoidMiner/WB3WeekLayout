package com.example.wb3weeklayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wb3weeklayout.databinding.FragmentTemplateoneBinding


class TemplateOne : Fragment() {
    private lateinit var binding : FragmentTemplateoneBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTemplateoneBinding.inflate(inflater, container,false)
        return binding.root
    }


}
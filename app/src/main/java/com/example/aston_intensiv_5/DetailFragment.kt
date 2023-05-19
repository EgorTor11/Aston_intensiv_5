package com.example.aston_intensiv_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.aston_intensiv_5.databinding.FragmentDetailBinding
import com.example.aston_intensiv_5.databinding.FragmentListBinding


class DetailFragment : Fragment() {
    lateinit var  binding: FragmentDetailBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvDetal.text=requireArguments().getString("key")

    }
    companion object{
     fun getInstance(value: String):DetailFragment{
         return DetailFragment().apply {
             arguments= bundleOf("key" to value)
         }

     }
    }
}
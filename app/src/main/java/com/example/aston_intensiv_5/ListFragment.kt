package com.example.aston_intensiv_5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.aston_intensiv_5.databinding.FragmentListBinding


class ListFragment : Fragment() {
    lateinit var binding: FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.item1.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                DetailFragment.getInstance(
                    binding.tvName1.text.toString() + "\n" +
                            binding.tvNumber1.text.toString().toInt()
                )
            ).addToBackStack(null).commit()

        }
        binding.item2.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                DetailFragment.getInstance(
                    binding.tvName2.text.toString() + "\n" +
                            binding.tvNumber2.text.toString().toInt()
                )
            ).addToBackStack(null).commit()
        }
        binding.item3.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                DetailFragment.getInstance(
                    binding.tvName3.text.toString() + "\n" +
                            binding.tvNumber3.text.toString().toInt()
                )
            ).addToBackStack(null).commit()
        }

    }

    companion object {
        fun getInstance(): ListFragment {
            return ListFragment()
        }
    }
}

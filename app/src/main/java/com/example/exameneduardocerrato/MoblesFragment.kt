package com.example.exameneduardocerrato

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.exameneduardocerrato.databinding.FragmentMoblesBinding

class MoblesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentMoblesBinding.inflate(inflater)

        binding.buttonAfegir.setOnClickListener{
            findNavController().navigate(R.id.action_moblesFragment_to_afegirMobleFragment)
        }

        return binding.root

    }

    companion object {

    }
}
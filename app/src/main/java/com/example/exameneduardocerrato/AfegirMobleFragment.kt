package com.example.exameneduardocerrato

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.exameneduardocerrato.MVVM.MoblesViewModel
import com.example.exameneduardocerrato.databinding.FragmentAfegirMobleBinding

class AfegirMobleFragment : Fragment() {

    private lateinit var binding: FragmentAfegirMobleBinding

    private lateinit var afegirMobleViewModel: MoblesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAfegirMobleBinding.inflate(inflater)

        afegirMobleViewModel = ViewModelProvider(this).get(MoblesViewModel::class.java)

        binding.botonAfegirMoble.setOnClickListener{
            val nombre = binding.editTextNomMoble.text.toString()
            val preu = binding.editTextPreuMoble.text.toString().toInt()

            afegirMobleViewModel.afegirMoble(requireContext(), nombre, preu)
            Toast.makeText(context, "Moble creat", Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.moblesFragment)

        }
        return binding.root
    }

    companion object {
    }
}
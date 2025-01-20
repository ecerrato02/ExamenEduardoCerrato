package com.example.exameneduardocerrato

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exameneduardocerrato.Adapter.MobleAdapter
import com.example.exameneduardocerrato.MVVM.LlistarViewModel
import com.example.exameneduardocerrato.databinding.FragmentMoblesBinding

class MoblesFragment : Fragment() {

    private lateinit var binding: FragmentMoblesBinding

    private lateinit var llistarViewModel: LlistarViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMoblesBinding.inflate(inflater)

        llistarViewModel = ViewModelProvider(this).get(LlistarViewModel::class.java)
        llistarViewModel.llistarMoble(requireContext())

        binding.moblesRecycler.layoutManager = LinearLayoutManager(requireContext())

        llistarViewModel.llista_moble?.observe(viewLifecycleOwner, Observer { moblellista ->
            binding.moblesRecycler.adapter = MobleAdapter(moblellista)
            Toast.makeText(requireContext(), "$moblellista", Toast.LENGTH_SHORT).show()
        })

        binding.buttonAfegir.setOnClickListener{
            findNavController().navigate(R.id.afegirMobleFragment)
        }
        return binding.root
    }

    companion object {

    }
}
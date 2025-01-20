package com.example.exameneduardocerrato.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.exameneduardocerrato.Data.Mobles
import com.example.exameneduardocerrato.R

class MobleAdapter(private val mList: List<Mobles>) : RecyclerView.Adapter<MobleAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.mobles_card_view, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val moble = mList[position]

        holder.textViewNom.text = moble.nombre
        holder.textViewEdat.text = moble.precio.toString()

        holder.layoutPulsar.setOnClickListener{view ->
                view.findNavController().navigate(R.id.actualitzarMobleFragment)
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textViewNom: TextView = itemView.findViewById(R.id.textViewNomMobleCanvi)
        val textViewEdat: TextView = itemView.findViewById(R.id.textViewPreuCanvi)
        val layoutPulsar: LinearLayout = itemView.findViewById(R.id.layoutMobles)
    }
}
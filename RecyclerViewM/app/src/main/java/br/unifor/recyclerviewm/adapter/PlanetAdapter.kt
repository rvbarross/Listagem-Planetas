package br.unifor.recyclerviewm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unifor.recyclerviewm.R
import br.unifor.recyclerviewm.model.Planets

class PlanetAdapter(val planet :List<Planets>) :RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    private var listener :OnPlanetItemClick? = null

    class PlanetViewHolder(val view :View, listener: OnPlanetItemClick?) :RecyclerView.ViewHolder(view){
        val iName :TextView
        val iMass :TextView
        val iSatellite :TextView
        val iTemperature :TextView
        val iImage :ImageView

        init{
            iName = view.findViewById(R.id.planet_item_textview_name)
            iMass = view.findViewById(R.id.planet_item_textview_mass)
            iSatellite = view.findViewById(R.id.planet_item_textview_satellite)
            iTemperature = view.findViewById(R.id.planet_item_textview_temperature)
            iImage = view.findViewById(R.id.planet_imageview)
            view.setOnClickListener {
                listener?.onClick(it, adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planet_item_list, parent, false)
        return PlanetViewHolder(view, listener)
    }

    fun setOnPlanetItemListener(listener :OnPlanetItemClick){
        this.listener = listener
    }

    override fun getItemCount(): Int {
        return planet.size
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.iName.text = planet[position].name
        holder.iMass.text = planet[position].mass
        holder.iSatellite.text = planet[position].numSatellite
        holder.iTemperature.text = planet[position].aTemperature
        when(holder.iName.text){
            "Mercurio" -> holder.iImage.setImageResource(R.drawable.mercury)
            "Vênus" -> holder.iImage.setImageResource(R.drawable.venus)
            "Terra" -> holder.iImage.setImageResource(R.drawable.earth)
            "Marte" -> holder.iImage.setImageResource(R.drawable.mars)
            "Júpiter" -> holder.iImage.setImageResource(R.drawable.jupiter)
            "Saturno" -> holder.iImage.setImageResource(R.drawable.saturn)
            "Urano" -> holder.iImage.setImageResource(R.drawable.uranus)
            "Netuno" -> holder.iImage.setImageResource(R.drawable.neptune)
            "Ceres" -> holder.iImage.setImageResource(R.drawable.ceres)
            "Plutão" -> holder.iImage.setImageResource(R.drawable.pluto)
            "Haumea" -> holder.iImage.setImageResource(R.drawable.haumea)
            "Makemake" -> holder.iImage.setImageResource(R.drawable.makemake)
            "Éris" -> holder.iImage.setImageResource(R.drawable.eris)
        }

    }
}
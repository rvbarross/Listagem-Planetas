package br.unifor.recyclerviewm.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import br.unifor.recyclerviewm.R
import br.unifor.recyclerviewm.repository.Repository

class DetalActivity : AppCompatActivity() {
    private lateinit var dName :TextView
    private lateinit var dMass :TextView
    private lateinit var dSatellite :TextView
    private lateinit var dTemperature :TextView
    private lateinit var dImage :ImageView

    private val planets = Repository.getAllPlanets()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detal)
        val ID = intent.getIntExtra("ID", -1)

        dName = findViewById(R.id.detal_textview_name)
        dMass = findViewById(R.id.detal_textview_mass)
        dSatellite = findViewById(R.id.detal_textview_satellite)
        dTemperature = findViewById(R.id.detal_textview_temperature)
        dImage = findViewById(R.id.detal_imageview)

        if(ID != -1){
            dName.text = "Nome do planeta : ${planets[ID].name}"
            dMass.text = "Massa do planeta: ${planets[ID].mass}"
            dSatellite.text = "Número de satelites naturais do planeta: ${planets[ID].numSatellite}"
            dTemperature.text = "Temperatura média do planeta: ${planets[ID].aTemperature}"
            when(planets[ID].name){
                "Mercurio" -> dImage.setImageResource(R.drawable.mercury)
                "Vênus" -> dImage.setImageResource(R.drawable.venus)
                "Terra" -> dImage.setImageResource(R.drawable.earth)
                "Marte" -> dImage.setImageResource(R.drawable.mars)
                "Júpiter" -> dImage.setImageResource(R.drawable.jupiter)
                "Saturno" -> dImage.setImageResource(R.drawable.saturn)
                "Urano" -> dImage.setImageResource(R.drawable.uranus)
                "Netuno" -> dImage.setImageResource(R.drawable.neptune)
                "Ceres" -> dImage.setImageResource(R.drawable.ceres)
                "Plutão" -> dImage.setImageResource(R.drawable.pluto)
                "Haumea" -> dImage.setImageResource(R.drawable.haumea)
                "Makemake" -> dImage.setImageResource(R.drawable.makemake)
                "Éris" -> dImage.setImageResource(R.drawable.eris)
            }
        }

    }
}
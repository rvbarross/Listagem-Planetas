package br.unifor.recyclerviewm.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unifor.recyclerviewm.R
import br.unifor.recyclerviewm.adapter.OnPlanetItemClick
import br.unifor.recyclerviewm.adapter.PlanetAdapter
import br.unifor.recyclerviewm.repository.Repository

class MainActivity : AppCompatActivity(), OnPlanetItemClick {
    private lateinit var mList :RecyclerView
    private val planets = Repository.getAllPlanets()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val llm = LinearLayoutManager(this)
        val planetAdapter = PlanetAdapter(planets)
        planetAdapter.setOnPlanetItemListener(this)
        mList = findViewById(R.id.main_recyclerview_list)
        mList.apply {
            adapter = planetAdapter
            layoutManager = llm
            hasFixedSize()
        }

    }

    override fun onClick(view: View, position: Int) {
        val it = Intent(this, DetalActivity::class.java)
        it.putExtra("ID", position)
        startActivity(it)

    }
}
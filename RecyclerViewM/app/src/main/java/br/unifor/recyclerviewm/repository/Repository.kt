package br.unifor.recyclerviewm.repository

import br.unifor.recyclerviewm.model.Planets

object Repository {

    fun getAllPlanets() :List<Planets>{
        return listOf(
                Planets("Mercurio", "3,285 × 10^23 kg", "0", "179ºC"),
                Planets("Vênus", "4,867 × 10^24 kg", "0", "461ºC"),
                Planets("Terra", "5,972 × 10^24 kg", "1", "14ºC"),
                Planets("Marte", "6,39 × 10^23 kg", "2", "−63ºC"),
                Planets("Júpiter", "1,898 × 10^27 kg", "79", "-108ºC"),
                Planets("Saturno", "5,683 × 10^26 kg", "82", "-139ºC"),
                Planets("Urano", "8,681 × 10^25 kg", "27", "-220ºC"),
                Planets("Netuno", "1,024 × 10^26 kg", "14", "−223,15ºC"),
                Planets("Ceres", "9,5 × 10^20 kg", "0", " -106ºC"),
                Planets("Plutão", "1,305 × 10^22 kg", "5", "-229ºC"),
                Planets("Haumea", "(4,2±0,1) × 10^21 kg", "2", "-223,2ºC"),
                Planets("Makemake", "Desconhecido", "1", "-240°C"),
                Planets("Éris", "(1,66±0,02) × 10^22 kg", "1", "-243 ºC")
                )
    }

}
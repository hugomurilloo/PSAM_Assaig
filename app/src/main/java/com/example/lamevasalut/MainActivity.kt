package com.example.lamevasalut

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val dadesSalut = listOf(
        Pair("Distància caminant o corrent" , "11,6 km"),
        Pair("Passos" , "14.320"),
        Pair("Pes" , "69,3 kg"),
        Pair("Pressió arterial" , "133/78 mmHg"),
        Pair("Freqüència cardíaca en repòs" , "62 bpm"),
        Pair("Freqüència cardíaca màxima" , "152 bpm"),
        Pair("Calories cremades" , "2450 kcal"),
        Pair("Son total" , "7 h 42 min"),
        Pair("Son profund" , "1 h 18 min"),
        Pair("Oximetria" , "97%"),
        Pair("Glucosa en sang" , "92 mg/dL"),
        Pair("Temperatura corporal" , "36,6 ºC"),
        Pair("IMC" , "22,3"),
        Pair("Nivell d’estrès" , "Baix"),
        Pair("Altitud acumulada pujada" , "184 m"),
        Pair("Nivell d’hidratació" , "1,9 L"),
        Pair("Cicles cardíacs irregulars detectats" , "0"),
        Pair("Temps d’exercici" , "46 min"),
        Pair("VO₂ Max" , "46 ml/kg/min"),
        Pair("Grasa corporal" , "16,4%"),
        Pair("Massa muscular" , "52,1 kg")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
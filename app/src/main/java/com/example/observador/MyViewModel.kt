package com.example.observador

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlin.random.Random

// ViewModel que contiene la lógica y los datos de la aplicación
class MyViewModel : ViewModel() {

    // Creamos la variable a observar
    val currentName: MutableStateFlow<String?> = MutableStateFlow("(valor inicial)")

    // funcion para actualizar la variable
    // necesitamos usar la propiedad "value" ya que es un MutableStateFlow
    fun addRandom() {
        val enteroRandom = Random.nextInt(0,10)
        currentName.value = "Pepe:$enteroRandom"
        Log.d("actualiza", currentName.value ?: "null")
    }
}
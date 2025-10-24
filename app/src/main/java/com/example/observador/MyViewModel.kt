package com.example.observador

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

// ViewModel que contiene la lógica y los datos de la aplicación
class MyViewModel : ViewModel() {

    // Creamos la variable a observar
    val currentName: MutableLiveData<String?> = MutableLiveData("pepe")

    // funcion para actualizar la variable
    // necesitamos usar la propiedad "value" ya que es un MutableLiveData
    fun addRandom() {
        var enteroRandom = Random.nextInt(0,10)
        currentName.value = "pepe:$enteroRandom"
        Log.d("actualiza", currentName.value ?: "null")
    }
}
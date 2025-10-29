package com.example.observador

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun IU(model: MyViewModel){

    val newName by model.currentName.collectAsState("")
    // centramos contenido
    Column(
        modifier = Modifier.fillMaxSize(), // Hace que la columna ocupe todo el ancho y alto.
        verticalArrangement = Arrangement.Center, // Centra los elementos verticalmente.
        horizontalAlignment = Alignment.CenterHorizontally // Centra los elementos horizontalmente.
    ) {
        // llamamos a las funciones que tienen los objetos de la IU
        ActualizaTexto(newName)
        Boton(model)
    }
}

@Composable
fun ActualizaTexto(newName: String?) {
    Text(text = "Hello $newName!")
    Log.d("actualiza", "actualizo: $newName")

}

@Composable
fun Boton(model: MyViewModel) {
    Button(onClick = { model.addRandom() }) {
        Text(text = "Añade un numero")
    }
}

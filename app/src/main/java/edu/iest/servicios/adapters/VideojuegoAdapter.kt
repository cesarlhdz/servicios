package edu.iest.servicios.adapters

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import edu.iest.servicios.models.Videojuego

class VideojuegoAdapter (videojuegos: ArrayList<Videojuego>, contexto: Context){
    var innerVideojuegos: ArrayList<Videojuego> = videojuegos
    var innerContext: Context= contexto

    inner class ContenedorDeVista(view: View) :
            RecyclerView.ViewHolder(view){
                //aqui haremos el inflate del layout
            }
}
package com.example.tiendavirtualapp

import android.content.Context
import android.text.format.DateFormat
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

import java.util.Calendar
import java.util.Locale

class Constantes {

    fun obtenerTiempoD() : Long{
        return System.currentTimeMillis()
    }

    //Función para obtener una fecha
    fun obtenerFecha (tiempo : Long) : String{
        val calendar = Calendar.getInstance(Locale.ENGLISH)
        calendar.timeInMillis = tiempo

        return DateFormat.format("dd/MM/yyyy",calendar).toString()
    }

}
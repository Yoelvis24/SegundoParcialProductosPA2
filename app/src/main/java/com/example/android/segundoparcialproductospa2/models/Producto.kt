package com.example.android.segundoparcialproductospa2.models

//Clase para prueba
data class Producto(
    val millas: Int,
    val observaciones: String,
    val travelId: Int
)

//Esta es la verdadera clase pero no puedo usarla por problemas de Azure
/*data class Producto (
    val productoId: Int,
    val decripcion: String,
    val existencia: Float,
    val costo: Float,
    val valorInventario: Float
)*/
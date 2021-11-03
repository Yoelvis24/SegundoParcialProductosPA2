package com.example.android.segundoparcialproductospa2.api

import com.example.android.segundoparcialproductospa2.models.Producto
import retrofit2.http.GET

interface ProductoApi {
    //@GET de prueba
    @GET("Travels")
    suspend fun getProducto():List<Producto>


    //este es el verdadero @GET
    /*@GET("Productos")
    suspend fun getProducto():List<Producto>*/
}
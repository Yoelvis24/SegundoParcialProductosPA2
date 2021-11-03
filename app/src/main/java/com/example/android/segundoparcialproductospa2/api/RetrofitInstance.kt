package com.example.android.segundoparcialproductospa2.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: ProductoApi by lazy{
        Retrofit.Builder()
            .baseUrl("https://aplicada2021.azurewebsites.net/api/") //Link de prueba
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductoApi::class.java)
    }
}
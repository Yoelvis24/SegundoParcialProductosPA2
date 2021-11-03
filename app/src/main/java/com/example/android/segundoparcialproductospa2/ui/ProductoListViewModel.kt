package com.example.android.segundoparcialproductospa2.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ProductoListViewModel(application: Application) : ViewModel() {

    class Factory(val app : Application): ViewModelProvider.Factory{
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if(modelClass.isAssignableFrom((ProductoListViewModel::class.java))){
                @Suppress("UNCHECKED_CAST")
                return ProductoListViewModel(app) as T
            }
            throw IllegalAccessException("Unable to construct viewModel")
        }
    }
}
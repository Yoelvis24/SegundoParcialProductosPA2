package com.example.android.segundoparcialproductospa2.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.segundoparcialproductospa2.databinding.ProductoRowBinding
import com.example.android.segundoparcialproductospa2.models.Producto

class ProductoAdapter : RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder>() {

    //Variable tipo lista para almacenar los valores de la api
    private var productos = emptyList<Producto>()


    fun submitList(lista: List<Producto>){
        productos = lista
        notifyDataSetChanged()
    }
    //Esta clase sirve para insertar los valores de la Api en la lista
    inner class ProductoViewHolder(val binding: ProductoRowBinding) :
        RecyclerView.ViewHolder(binding.root){

        fun bind(producto: Producto){

            //Este es el que va pero no puedo usarlo por el problema de mi cuenta de Azure
            /*binding.productoIdTextView.text = producto.productoId.toString()
            binding.descripcionTextView.text = producto.descripcion
            binding.existenciaTextView.text = producto.existencia.toString()
            binding.costoTextView.text = producto.costo.toString()
            binding.valorInventarioTextView.text = producto.valorInventario.toString()*/

            binding.productoIdTextView.text = producto.travelId.toString()
            binding.descripcionTextView.text = producto.observaciones
            binding.existenciaTextView.text = "12"
            binding.costoTextView.text = producto.millas.toString()
            binding.valorInventarioTextView.text = "25"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ProductoRowBinding.inflate(inflater, parent, false)

        return ProductoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductoViewHolder, position: Int) {
        val producto = productos[position]

        holder.bind(producto)
    }

    override fun getItemCount(): Int {
        return productos.size
    }

}
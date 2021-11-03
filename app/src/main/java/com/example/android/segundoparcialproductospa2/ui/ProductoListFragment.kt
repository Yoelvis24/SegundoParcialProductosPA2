package com.example.android.segundoparcialproductospa2.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.android.segundoparcialproductospa2.R
import com.example.android.segundoparcialproductospa2.adapters.ProductoAdapter
import com.example.android.segundoparcialproductospa2.api.RetrofitInstance
import com.example.android.segundoparcialproductospa2.databinding.ProductoListFragmentBinding

class ProductoListFragment : Fragment() {

    private var _binding: ProductoListFragmentBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = ProductoListFragment()
    }

    private lateinit var viewModel: ProductoListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ProductoListFragmentBinding.inflate(layoutInflater)
        viewModel =
            ViewModelProvider(this, ProductoListViewModel.Factory(requireActivity().application))
                .get(ProductoListViewModel::class.java)

        lifecycleScope.launchWhenCreated {
            val lista = RetrofitInstance.api.getProducto()

            var cant = lista.size
            val adapter = ProductoAdapter()
            adapter.submitList(lista)
            binding.productosRecycleView.adapter = adapter
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProductoListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
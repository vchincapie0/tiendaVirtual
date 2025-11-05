package com.example.tiendavirtualapp.Vendedor.Nav_Fragments_Vendedor


import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tiendavirtualapp.Vendedor.Bottom_Nav_Fragments_Vendedor.FragmentMisProductosV
import com.example.tiendavirtualapp.Vendedor.Bottom_Nav_Fragments_Vendedor.FragmentOrdenesV
import com.example.tiendavirtualapp.Vendedor.Productos.AgregarProductoActivity
import com.example.tiendavirtualapp.R
import com.example.tiendavirtualapp.databinding.FragmentInicioVBinding


class FragmentInicioV : Fragment() {

    private lateinit var binding: FragmentInicioVBinding
    private lateinit var mContext: Context

    override fun onAttach(context: Context) {
        mContext = context
        super.onAttach(context)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentInicioVBinding.inflate(inflater, container, false)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.op_mis_productos -> {
                    replaceFragment(FragmentMisProductosV())
                }

                R.id.op_mis_ordenes -> {
                    replaceFragment(FragmentOrdenesV())
                }

            }
            true
        }

        replaceFragment(FragmentMisProductosV())
        binding.bottomNavigation.selectedItemId = R.id.op_mis_productos


        binding.addFab.setOnClickListener {
            startActivity(Intent(context, AgregarProductoActivity::class.java))
        }

        return binding.root

    }
    private fun replaceFragment(fragment: Fragment)    {
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.bottomFragment, fragment)
                .commit()
    }


}
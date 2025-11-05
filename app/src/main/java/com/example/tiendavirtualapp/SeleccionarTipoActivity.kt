package com.example.tiendavirtualapp

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.tiendavirtualapp.databinding.ActivitySeleccionarTipoBinding
import com.example.tiendavirtualapp.Vendedor.LoginVendedorActivity
import com.example.tiendavirtualapp.Cliente.LoginClienteActivity

class SeleccionarTipoActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySeleccionarTipoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeleccionarTipoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*Iniciar sesión con vendedor*/
        binding.tipoVendedor.setOnClickListener {
            startActivity(Intent(this@SeleccionarTipoActivity, LoginVendedorActivity::class.java))
        }

        /*Iniciar sesión con cliente*/
        binding.tipoCliente.setOnClickListener {
            startActivity(Intent(this@SeleccionarTipoActivity, LoginClienteActivity::class.java))
        }
    }
}
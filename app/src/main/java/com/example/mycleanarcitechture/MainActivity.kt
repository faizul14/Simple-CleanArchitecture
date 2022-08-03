package com.example.mycleanarcitechture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mycleanarcitechture.databinding.ActivityMainBinding
import com.example.mycleanarcitechture.helper.ViewModelFactory
import com.example.mycleanarcitechture.presentation.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.setName("Faezol Padli")
        viewModel.nama.observe(this){ data ->
            binding.txtName.text = data.nama
        }
    }
}
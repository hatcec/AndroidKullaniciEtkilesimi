package com.example.androidkullanicietkilesimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import com.example.androidkullanicietkilesimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonNormal.setOnClickListener {
            Toast.makeText(applicationContext,"normal mesaj verildi", Toast.LENGTH_LONG).show()
        }
        binding.buttonOzel.setOnClickListener {
            val tasarim=layoutInflater.inflate(R.layout.toast_tasarim,null)
            val textViewMesaj=tasarim.findViewById(R.id.textViewMesaj)as TextView
            textViewMesaj.text="merhaba özel mesaj"
            val toast=Toast(applicationContext)
            toast.view=tasarim
            toast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL,0,0)
            toast.duration=Toast.LENGTH_LONG
            toast.show()
        }
    }
}
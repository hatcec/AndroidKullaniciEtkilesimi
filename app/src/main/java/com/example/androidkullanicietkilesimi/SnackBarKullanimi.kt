package com.example.androidkullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidkullanicietkilesimi.databinding.ActivitySnackBarKullanimiBinding
import com.google.android.material.snackbar.Snackbar

class SnackBarKullanimi : AppCompatActivity() {
    lateinit var binding:ActivitySnackBarKullanimiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySnackBarKullanimiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonNormal.setOnClickListener {nesne->
            Snackbar.make(nesne,"merhaba", Snackbar.LENGTH_SHORT).show()
        }
        binding.buttonGeriDonus.setOnClickListener { x->
            Snackbar.make(x,"mesaj silinsin mi?",Snackbar.LENGTH_SHORT)
                .setAction("Evet"){y->
                    Snackbar.make(y,"mesaj silindi", Snackbar.LENGTH_SHORT).show()
                }.show()
        }
        binding.buttonOzel.setOnClickListener { n->
            val sb=Snackbar.make(n,"internet bağlantısı yok",Snackbar.LENGTH_LONG)
            sb.setAction("tekrar dene"){

            }
            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.WHITE)
            sb.show()
        }
    }
}
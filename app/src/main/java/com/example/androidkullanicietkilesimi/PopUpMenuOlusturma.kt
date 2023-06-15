package com.example.androidkullanicietkilesimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.androidkullanicietkilesimi.databinding.ActivityPopUpMenuOlusturmaBinding

class PopUpMenuOlusturma : AppCompatActivity() {
    lateinit var binding :ActivityPopUpMenuOlusturmaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPopUpMenuOlusturmaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonMenuAc.setOnClickListener {
            val popup=PopupMenu(this@PopUpMenuOlusturma,binding.buttonMenuAc)
            popup.menuInflater.inflate(R.menu.pop_up_menu,popup.menu)

            popup.setOnMenuItemClickListener { item->
                when(item.itemId){
                    R.id.action_sil->{
                        Toast.makeText(applicationContext,"sil tıklandı", Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.action_duzenle->{
                        Toast.makeText(applicationContext,"düzenle tıklandı", Toast.LENGTH_LONG).show()
                        true
                    }
                    else ->false
                }
            }
            popup.show()
        }

    }
}
package com.example.androidkullanicietkilesimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.androidkullanicietkilesimi.databinding.ActivityAlertViewBinding

class AlertViewActivity : AppCompatActivity() {
    lateinit var binding:ActivityAlertViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAlertViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonNormal.setOnClickListener {
            val ad=AlertDialog.Builder(this@AlertViewActivity)
            ad.setMessage("mesaj")
            ad.setTitle("başlık")
            ad.setIcon(R.drawable.kullanim)
            ad.setPositiveButton("tamam"){dialogInterface, i->
                Toast.makeText(applicationContext,"tamam tıklandı",Toast.LENGTH_SHORT).show()
            }
            ad.setNegativeButton("iptal"){dialogInterface, i->
                Toast.makeText(applicationContext,"iptal tıklandı",Toast.LENGTH_SHORT).show()
            }
            ad.create().show()
        }
       binding.ozelbutton.setOnClickListener {

            val tasarim=layoutInflater.inflate(R.layout.alert_tasarim,null)
            val edittestAlert=tasarim.findViewById(R.id.editTextalert)as EditText

            val alert=AlertDialog.Builder(this@AlertViewActivity)
            alert.setTitle("Başlık")
            alert.setIcon(R.drawable.kullanim)
            alert.setView(tasarim)
            alert.setMessage("mesaj")
            alert.setPositiveButton("kaydet"){dialogInterface, i->
                val alinanVeri=edittestAlert.text.toString()
                Toast.makeText(applicationContext,"Alinan veri:$alinanVeri",Toast.LENGTH_LONG).show()
            }
            alert.setNegativeButton("iptal"){dialogInterface ,i->
                Toast.makeText(applicationContext,"iptal tıklandı",Toast.LENGTH_LONG).show()
            }
       alert.create().show()
       }

    }
}
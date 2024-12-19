package com.paudam.projectecafeteriapaupulido

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.paudam.projectecafeteriapaupulido.databinding.ActivityRegisterBinding

class ActivityRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityRegisterBinding = DataBindingUtil.setContentView(this, R.layout.activity_register)
        enableEdgeToEdge()

        //si las contras no son iguales toast
        binding.button.setOnClickListener {
            val contra1 = binding.PasswordRegisterText.text.toString()
            val contra2 = binding.PasswordRegisterConfirmText.text.toString()
            if(contra1 == contra2){
                val GoApp = Intent(this, ActivityHome::class.java)
                startActivity(GoApp)
            }else{
                val ErrPassw = "LAS CONTRAS NO COINCIDEN"
                val duracion = Toast.LENGTH_SHORT
                val toast = Toast.makeText(this, ErrPassw, duracion)
                toast.show()
            }



        }

    }
}
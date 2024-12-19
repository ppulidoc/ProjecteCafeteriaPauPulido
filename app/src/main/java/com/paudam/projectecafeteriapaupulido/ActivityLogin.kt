package com.paudam.projectecafeteriapaupulido

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.paudam.projectecafeteriapaupulido.databinding.ActivityLoginBinding

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        enableEdgeToEdge()

        binding.buttonLogin.setOnClickListener {
            val user = binding.userText.text.toString()
            val passwd = binding.PasswordText.text.toString()
            if ( user == "ppulido" && passwd == "123456"){
                val ActividadHome = Intent(this, ActivityHome::class.java)
                startActivity(ActividadHome)
            }
            else {
                val ErrLoginMssg = "USER O CONTRA INCORRECTO"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(this, ErrLoginMssg, duration)
                toast.show()
            }


        }

    }
}
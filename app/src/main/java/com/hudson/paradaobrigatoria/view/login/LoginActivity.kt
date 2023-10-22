package com.hudson.paradaobrigatoria.view.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hudson.paradaobrigatoria.R
import com.hudson.paradaobrigatoria.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = loginBinding.root
        setContentView(view)
    }
}
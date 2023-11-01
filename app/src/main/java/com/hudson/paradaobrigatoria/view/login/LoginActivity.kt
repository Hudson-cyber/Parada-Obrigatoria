package com.hudson.paradaobrigatoria.view.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hudson.paradaobrigatoria.R
import com.hudson.paradaobrigatoria.databinding.ActivityLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {
    val loginViewModel: LoginViewModel by viewModel<LoginViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = loginBinding.root
        setContentView(view)

        loginBinding.btnLogin.setOnClickListener {
            val email = loginBinding.txtInpEmail.text.toString()
            val password = loginBinding.txtInpPassword.text.toString()
            if (email.isEmpty()){
                loginBinding.textInputLayout.error = "email em branco"
            }else if (password.isEmpty()){
                loginBinding.textInputLayout2.error = "senha em branco"
            }else{
                loginViewModel.sendDataLogin(email = email, password = password)
            }
        }
    }
}
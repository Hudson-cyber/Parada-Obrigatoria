package com.hudson.paradaobrigatoria.view.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hudson.paradaobrigatoria.domain.models.AppDataLogin
import com.hudson.paradaobrigatoria.domain.repositories.DataAppRepository
import kotlinx.coroutines.launch

class LoginViewModel(private val dataAppRepository: DataAppRepository) : ViewModel() {
    //private val repositoriesMutableLiveData: MutableLiveData<List<AppData>> = MutableLiveData()

    fun sendDataLogin(password: String, email: String) {
        viewModelScope.launch {
            dataAppRepository.sendloginRepository(
                AppDataLogin(
                    email = email,
                    password = password,
                    userId = null,
                    sessionId = null,
                    establishmentId = null
                )
            )
        }
    }
}
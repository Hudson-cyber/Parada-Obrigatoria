package com.hudson.paradaobrigatoria.data_remote.data_source

import com.hudson.paradaobrigatoria.data_remote.models.ApiDataLogin
import com.hudson.paradaobrigatoria.data_remote.models.ResponseDataLogin
import com.hudson.paradaobrigatoria.data_remote.models.ResponseManualLoad
import com.hudson.paradaobrigatoria.data_remote.models.StatusApi
import com.hudson.paradaobrigatoria.data_remote.services.ApiServices
import com.hudson.paradaobrigatoria.domain.data_sources.AppDataSource
import com.hudson.paradaobrigatoria.domain.models.AppDataLogin

class ApiDataSource(private val api: ApiServices): AppDataSource {
    override suspend fun sendLogin(apiDataLogin: ApiDataLogin): StatusApi<String, ResponseDataLogin?> {
        val response = api.sendLogin(apiDataLogin.email, apiDataLogin.password)
         if (response.isSuccessful){
           response.body().let {responseDataLogin ->
              return StatusApi.Successful(responseDataLogin)
           }
        }else{
          return  StatusApi.Failure (response.message())
        }
    }

    override suspend fun manualLoad(
        userId: String,
        establishmentId: String
    ): StatusApi<String, ResponseManualLoad> {
       api.manualLoad(userId = userId, establishmentId =  establishmentId)
    }

    override suspend fun closeSession(userId: String, establishmentId: String, sessionId: String) {
        api.closeSession(userId, establishmentId, sessionId)
    }

}
package com.hudson.paradaobrigatoria.data_remote.data_source

import com.hudson.paradaobrigatoria.data_remote.models.ApiDataLogin
import com.hudson.paradaobrigatoria.data_remote.services.ApiServices
import com.hudson.paradaobrigatoria.domain.data_sources.AppDataSource
import com.hudson.paradaobrigatoria.domain.models.AppDataLogin

class ApiDataSource(private val api: ApiServices): AppDataSource {
    override suspend fun sendLogin(apiDataLogin: ApiDataLogin) {
        api.sendLogin(apiDataLogin.email, apiDataLogin.password)
    }

    override suspend fun manualLoad(userId: String, establishmentId: String) {
       api.manualLoad(userId, establishmentId)
    }

    override suspend fun closeSession(userId: String, establishmentId: String, sessionId: String) {
        api.closeSession(userId, establishmentId, sessionId)
    }

}
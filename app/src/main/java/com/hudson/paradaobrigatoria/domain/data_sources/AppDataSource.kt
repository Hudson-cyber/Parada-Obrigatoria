package com.hudson.paradaobrigatoria.domain.data_sources

import com.hudson.paradaobrigatoria.data_remote.models.ApiDataLogin
import com.hudson.paradaobrigatoria.data_remote.models.ResponseDataLogin
import com.hudson.paradaobrigatoria.data_remote.models.ResponseManualLoad
import com.hudson.paradaobrigatoria.data_remote.models.StatusApi

interface AppDataSource {
    suspend fun sendLogin(apiDataLogin: ApiDataLogin): StatusApi<String, ResponseDataLogin?>
    suspend fun manualLoad(userId: String, establishmentId: String): StatusApi<String, ResponseManualLoad?>
    suspend fun closeSession(userId: String, establishmentId: String, sessionId: String)
}
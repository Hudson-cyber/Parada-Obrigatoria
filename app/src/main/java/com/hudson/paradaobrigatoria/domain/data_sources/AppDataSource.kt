package com.hudson.paradaobrigatoria.domain.data_sources

import com.hudson.paradaobrigatoria.data_remote.models.ApiDataLogin

interface AppDataSource {
    suspend fun sendLogin(apiDataLogin: ApiDataLogin)
    suspend fun manualLoad(userId: String?, establishmentId: String?)
    suspend fun closeSession(userId: String?, establishmentId: String?, sessionId: String?)
}
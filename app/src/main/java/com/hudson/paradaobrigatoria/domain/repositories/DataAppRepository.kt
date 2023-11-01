package com.hudson.paradaobrigatoria.domain.repositories

import com.hudson.paradaobrigatoria.data_remote.models.ResponseDataLogin
import com.hudson.paradaobrigatoria.data_remote.models.StatusApi
import com.hudson.paradaobrigatoria.domain.models.AppDataLogin

interface DataAppRepository {
    suspend fun sendloginRepository(appDataLogin: AppDataLogin): StatusApi<String,ResponseDataLogin>
    suspend fun manualLoad(appDataLogin: AppDataLogin)
    suspend fun closeSession(appDataLogin: AppDataLogin)
}
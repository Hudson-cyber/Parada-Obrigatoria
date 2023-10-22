package com.hudson.paradaobrigatoria.domain.repositories

import com.hudson.paradaobrigatoria.data_remote.repositories.StatusApi
import com.hudson.paradaobrigatoria.domain.models.AppDataLogin

interface DataAppRepository {
    suspend fun sendloginRepository(appDataLogin: AppDataLogin)
    suspend fun manualLoad(appDataLogin: AppDataLogin)
    suspend fun closeSession(appDataLogin: AppDataLogin)
}
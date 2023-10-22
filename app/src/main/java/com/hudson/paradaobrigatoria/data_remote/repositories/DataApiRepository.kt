package com.hudson.paradaobrigatoria.data_remote.repositories

import com.hudson.paradaobrigatoria.data_remote.models.ApiDataLogin
import com.hudson.paradaobrigatoria.domain.data_sources.AppDataSource
import com.hudson.paradaobrigatoria.domain.models.AppDataLogin
import com.hudson.paradaobrigatoria.domain.repositories.DataAppRepository


class DataApiRepository(private var dataSource: AppDataSource) :  DataAppRepository{
    override suspend fun sendloginRepository(appDataLogin: AppDataLogin) {
        val data = ApiDataLogin(appDataLogin.email, appDataLogin.password)
        dataSource.sendLogin(data)
    }

    override suspend fun manualLoad(appDataLogin: AppDataLogin) {
        dataSource.manualLoad(appDataLogin.userId,appDataLogin.establishmentId)
    }

    override suspend fun closeSession(appDataLogin: AppDataLogin) {
       dataSource.closeSession(appDataLogin.userId,appDataLogin.establishmentId, appDataLogin.sessionId)
    }

}
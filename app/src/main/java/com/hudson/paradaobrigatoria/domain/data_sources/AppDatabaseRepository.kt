package com.hudson.paradaobrigatoria.domain.data_sources

import com.hudson.paradaobrigatoria.domain.models.AppClient

interface AppDatabaseRepository {
    fun getDataList(): List<AppClient>
    fun setDataBase(client: AppClient)
    fun getClient(plate: String): AppClient
    fun deleteClient(plate: String)
}
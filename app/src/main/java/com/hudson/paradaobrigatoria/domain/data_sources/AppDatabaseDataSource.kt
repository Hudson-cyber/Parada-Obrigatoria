package com.hudson.paradaobrigatoria.domain.data_sources

import com.hudson.paradaobrigatoria.data_local.model.DatabaseClient
import com.hudson.paradaobrigatoria.data_local.repository.StatusDataBase

interface AppDatabaseDataSource {
    fun setDataBase(client: DatabaseClient)
    fun getClient(plate: String): DatabaseClient
    fun deleteClient(plate: String)
    fun getDataList(): List<DatabaseClient>
}
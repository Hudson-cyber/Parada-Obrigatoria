package com.hudson.paradaobrigatoria.data_local.data_sources

import com.hudson.paradaobrigatoria.data_local.model.DatabaseClient
import com.hudson.paradaobrigatoria.data_local.repository.StatusDataBase
import com.hudson.paradaobrigatoria.domain.data_sources.AppDao
import com.hudson.paradaobrigatoria.domain.data_sources.AppDatabaseDataSource

class DatabaseDataSource(private val dao: AppDao): AppDatabaseDataSource {
    override fun getDataList(): List<DatabaseClient> =dao.getDataList()

    override fun setDataBase(client: DatabaseClient) = dao.setDataBase(client)

    override fun getClient(plate: String): DatabaseClient = dao.getClient(plate)

    override fun deleteClient(plate: String) = dao.deleteClient(plate)
}
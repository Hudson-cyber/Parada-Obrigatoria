package com.hudson.paradaobrigatoria.data_local.repository

import com.hudson.paradaobrigatoria.data_local.model.DatabaseClient
import com.hudson.paradaobrigatoria.domain.data_sources.AppDatabaseDataSource
import com.hudson.paradaobrigatoria.domain.data_sources.AppDatabaseRepository
import com.hudson.paradaobrigatoria.domain.models.AppClient

class DatabaseRepository(private val appDatabaseDataSource: AppDatabaseDataSource) :
    AppDatabaseRepository {
    override fun getDataList(): List<AppClient> {
        val list = appDatabaseDataSource.getDataList()
        val listApp: MutableList<AppClient> = mutableListOf()
        for (data in list) {
            val appClient = AppClient(
                plate = data.plate,
                model = data.model,
                payment = data.payment,
                inputTime = data.inputTime,
                outputTime = data.outputTime,
                value = data.value,
                isPatio = data.isPatio
            )
            listApp.add(appClient)
        }
        return listApp
    }

    override fun setDataBase(client: AppClient) {
        val data = DatabaseClient(
            client.plate,
            client.model,
            client.payment,
            client.inputTime,
            client.outputTime,
            client.value,
            client.isPatio
        )
        appDatabaseDataSource.setDataBase(data)
    }

    override fun getClient(plate: String): AppClient {
        val data = appDatabaseDataSource.getClient(plate)
        return AppClient(
            plate = data.plate,
            model = data.model,
            payment = data.payment,
            inputTime = data.inputTime,
            outputTime = data.outputTime,
            value = data.value,
            isPatio = data.isPatio
        )
    }

    override fun deleteClient(plate: String) {
        appDatabaseDataSource.deleteClient(plate)
    }
}
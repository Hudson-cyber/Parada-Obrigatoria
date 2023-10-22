package com.hudson.paradaobrigatoria.domain.data_sources

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.hudson.paradaobrigatoria.data_local.model.DatabaseClient
import com.hudson.paradaobrigatoria.data_local.repository.StatusDataBase

@Dao
interface AppDao {
    @Query("SELECT * FROM client")
    fun getDataList(): List<DatabaseClient>

    @Insert
    fun setDataBase(client: DatabaseClient)

    @Query("SELECT * FROM client WHERE plate LIKE :plate")
    fun getClient(plate: String): DatabaseClient

    @Delete
    fun deleteClient(plate: String)
}
package com.hudson.paradaobrigatoria.data_local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hudson.paradaobrigatoria.data_local.model.DatabaseClient
import com.hudson.paradaobrigatoria.domain.data_sources.AppDao

@Database(entities = [DatabaseClient::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun clientDao(): AppDao
}
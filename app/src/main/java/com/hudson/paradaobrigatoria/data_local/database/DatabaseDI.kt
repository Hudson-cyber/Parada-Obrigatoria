package com.hudson.paradaobrigatoria.data_local.database

import android.content.Context
import androidx.room.Room

class DatabaseDI {
    fun provideDatabase(context: Context) =
        Room.databaseBuilder(context, AppDataBase::class.java, "client")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

    fun provideDao(db: AppDataBase) = db.clientDao()
}
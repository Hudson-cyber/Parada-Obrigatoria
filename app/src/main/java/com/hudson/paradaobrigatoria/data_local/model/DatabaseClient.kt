package com.hudson.paradaobrigatoria.data_local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "client")
data class DatabaseClient(
    @PrimaryKey val plate: String,
    @ColumnInfo(name = "model") val model: String,
    @ColumnInfo(name = "payment") val payment: Payment,
    @ColumnInfo(name = "input_time") val inputTime: String,
    @ColumnInfo(name = "output_time") val outputTime: String,
    @ColumnInfo(name = "value") val value: Int?,
    @ColumnInfo(name = "is_patio") val isPatio: Boolean
)

enum class Payment {
    CREDIT, MONEY, PIX, DEBIT
}


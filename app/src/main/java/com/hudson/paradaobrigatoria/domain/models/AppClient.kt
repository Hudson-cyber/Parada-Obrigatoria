package com.hudson.paradaobrigatoria.domain.models

import com.hudson.paradaobrigatoria.data_local.model.Payment

data class AppClient(
    val plate: String,
    val model: String,
    val payment: Payment?,
    val inputTime: String?,
    val outputTime: String?,
    val value: Int?,
    val isPatio: Boolean?
)

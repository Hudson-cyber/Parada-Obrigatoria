package com.hudson.paradaobrigatoria.data_remote.models

import com.google.gson.annotations.SerializedName

data class ResponseDataLogin(
    @SerializedName("user")
    val user : ResponseUser,
    @SerializedName("session")
    val session: ResponseSession,
    @SerializedName("cashier")
    val cashier: String?,
    @SerializedName("establishments")
    val establishments: List<ResponseEstablishments>,
    @SerializedName("cashReserve")
    val cashReserve: String?
    )

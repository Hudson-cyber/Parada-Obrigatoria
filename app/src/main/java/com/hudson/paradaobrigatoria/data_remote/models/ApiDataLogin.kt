package com.hudson.paradaobrigatoria.data_remote.models

import com.google.gson.annotations.SerializedName

data class ApiDataLogin(
    @SerializedName("email")
    val email: String?,
    @SerializedName("password")
    val password: String?
)

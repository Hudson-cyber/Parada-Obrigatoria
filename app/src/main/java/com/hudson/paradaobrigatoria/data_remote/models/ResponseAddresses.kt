package com.hudson.paradaobrigatoria.data_remote.models

import com.google.gson.annotations.SerializedName

data class ResponseAddresses(
    @SerializedName("city")
    val city: String?,
    @SerializedName("state")
    val state: String?,
    @SerializedName("number")
    val number: String?,
    @SerializedName("street")
    val street: String?,
    @SerializedName("district")
    val district: String?,
    @SerializedName("complement")
    val complement: String?,
    @SerializedName("postalCode")
    val postalCode: String?
)

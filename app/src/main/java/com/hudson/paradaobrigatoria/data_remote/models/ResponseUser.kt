package com.hudson.paradaobrigatoria.data_remote.models

import com.google.gson.annotations.SerializedName

data class ResponseUser(
    @SerializedName("userId")
    val userID: Int,
    @SerializedName("uuid")
    val uuid: String,
    @SerializedName("userCode")
    val userCode: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("document")
    val document: String,
    @SerializedName("profileId")
    val profileId: Int,
    @SerializedName("mainUser")
    val mainUser: Int,
    @SerializedName("userRestrictions")
    val userRestrictions: String?,
    @SerializedName("establishments")
    val establishments: List<Int>,
    @SerializedName("userRegistration")
    val userRegistration: String?,
    @SerializedName("appRestrictions")
    val appRestrictions: String?,
    @SerializedName("lastEstablishment")
    val lastEstablishment: String?,
    @SerializedName("serviceOrderCount")
    val serviceOrderCount: Int?,
    @SerializedName("rpsCount")
    val rpsCount: Int?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("accessToken")
    val accessToken: String?
)

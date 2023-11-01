package com.hudson.paradaobrigatoria.data_remote.models

import com.google.gson.annotations.SerializedName

data class ResponseSession(
    @SerializedName("sessionId")
    val sessionId: Int?,
    @SerializedName("establishmentId")
    val establishmentId: Int?,
    @SerializedName("startDateTime")
    val startDateTime: String?,
    @SerializedName("endDateTime")
    val endDateTime: String?,
    @SerializedName("userId")
    val userId: Int?,
    @SerializedName("active")
    val active: Int?,
    @SerializedName("versionName")
    val versionName: String?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("updated_at")
    val updatedAt: String?,
)

package com.hudson.paradaobrigatoria.data_remote.models

import com.google.gson.annotations.SerializedName

data class ResponseEstablishments(
    @SerializedName("establishmentId")
    val establishmentId: Int?,
    @SerializedName("establishmentCode")
    val establishmentCode: String?,
    @SerializedName("establishmentName")
    val establishmentName: String?,
    @SerializedName("establishmentTypes")
    val establishmentTypes: List<Int>,
    @SerializedName("phone")
    val phone: String?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("documentId")
    val documentId: String?,
    @SerializedName("companyName")
    val companyName: String?,
    @SerializedName("vacanciesMarks")
    val vacanciesMarks: Int?,
    @SerializedName("vacanciesOthers")
    val vacanciesOthers: Int?,
    @SerializedName("appPermission")
    val appPermission: Int?,
    @SerializedName("debitWarning")
    val debitWarning: Int?,
    @SerializedName("premiumPackage")
    val premiumPackage: Int?,
    @SerializedName("serviceOrderCount")
    val serviceOrderCount: Int?,
    @SerializedName("rpsCount")
    val rpsCount: Int?,
    @SerializedName("cashier")
    val addresses: List<ResponseAddresses>?,
    @SerializedName("userId")
    val userId: Int?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("accountId")
    val accountId: Long?,
    @SerializedName("cashReserve")
    val cashReserve: String?,
)

package com.hudson.paradaobrigatoria.data_remote.services

import com.hudson.paradaobrigatoria.data_remote.models.ResponseDataLogin
import com.hudson.paradaobrigatoria.data_remote.models.ResponseManualLoad
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServices {
    @POST("user/login")
    suspend fun sendLogin(email: String, password: String) : Response<ResponseDataLogin>

    @GET("{userId}/establishment/{establishmentId}/sync/manual")
    suspend fun manualLoad(@Header("Authorization") token: String, @Path("userId") userId: String, @Path("establishmentId") establishmentId: String): Response<ResponseManualLoad>
    //ver header

    @POST("{userId}/establishment/{establishmentId}/session/close/{sessionId}")
    suspend fun closeSession(@Header("Authorization") token: String, @Path("userId") userId: String, @Path("establishmentId") establishmentId: String, @Path("sessionId") sessionId: String)

}
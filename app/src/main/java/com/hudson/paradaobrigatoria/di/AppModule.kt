package com.hudson.paradaobrigatoria.di

import com.driver.shopper.shopperentregador.core.network.InternetTrafficChecker
import com.hudson.paradaobrigatoria.data_local.data_sources.DatabaseDataSource
import com.hudson.paradaobrigatoria.data_local.database.DatabaseDI
import com.hudson.paradaobrigatoria.data_local.repository.DatabaseRepository
import com.hudson.paradaobrigatoria.data_remote.data_source.ApiDataSource
import com.hudson.paradaobrigatoria.data_remote.repositories.DataApiRepository
import com.hudson.paradaobrigatoria.data_remote.services.ApiServices
import com.hudson.paradaobrigatoria.domain.data_sources.AppDataSource
import com.hudson.paradaobrigatoria.domain.repositories.DataAppRepository
import com.hudson.paradaobrigatoria.view.login.LoginViewModel
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    single<ApiServices> {
        Retrofit.Builder()
            .baseUrl("https://dev.app.jumpparkapi.com.br/api/")
            .client(OkHttpClient.Builder().build())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(ApiServices::class.java)
    }
    viewModel{
        LoginViewModel(get())
    }

    single { InternetTrafficChecker() }

    single<AppDataSource>{ApiDataSource(get())}
    single<DataAppRepository>{DataApiRepository(get())}
}
val databaseModule = module {
    single { DatabaseDI().provideDatabase(androidContext()) }
    single { DatabaseDI().provideDao(get())}

    factory { DatabaseRepository(get()) }
    factory { DatabaseDataSource(get()) }
}
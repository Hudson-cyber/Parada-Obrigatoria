package com.hudson.paradaobrigatoria.data_local.repository

import com.hudson.paradaobrigatoria.data_remote.repositories.StatusApi

sealed class StatusDataBase<out L, out R>{
    data class Successful<R>(var successful:R ) : StatusDataBase<Nothing, R>()
    data class Failure<L>(val error: L) : StatusDataBase<L, Nothing>()
}

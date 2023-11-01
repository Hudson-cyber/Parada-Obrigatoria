package com.hudson.paradaobrigatoria.data_remote.models

sealed class StatusApi<out L, out R>{
    data class Successful<R>(var successful:R ) : StatusApi<Nothing, R>()
    data class Failure<L>(val error: L) : StatusApi<L, Nothing>()
}

package com.hudson.paradaobrigatoria.data_remote.repositories

sealed class StatusApi<out L, out R>{
    data class Successful<R>(var successful:R ) : StatusApi<Nothing, R>()
    data class Failure<L>(val error: L) : StatusApi<L,Nothing>()
}

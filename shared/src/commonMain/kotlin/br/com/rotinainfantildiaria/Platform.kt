package br.com.rotinainfantildiaria

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
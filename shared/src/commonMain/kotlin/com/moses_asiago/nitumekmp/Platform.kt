package com.moses_asiago.nitumekmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
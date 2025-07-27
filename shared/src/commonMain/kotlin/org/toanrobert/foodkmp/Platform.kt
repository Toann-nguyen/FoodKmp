package org.toanrobert.foodkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
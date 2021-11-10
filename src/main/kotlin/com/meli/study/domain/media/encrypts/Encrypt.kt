package com.meli.study.domain.media.encrypts

interface Encrypt {
    fun process(document: String): String
}
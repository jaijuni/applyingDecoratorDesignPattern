package com.meli.study.domain.media.encrypts

class BinaryEncryptDecorator(
    private val instance: Encrypt
): EncryptDecorator(instance) {
    override fun process(document: String) =
        super.process(encrypt(document))


    private fun encrypt(document: String): String =
        document.toCharArray()
            .map { it + 2 }
            .joinToString {it.toString()}
}


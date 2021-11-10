package com.meli.study.domain.media.encrypts

open class EncryptDecorator(
    private val instance: Encrypt
    ): Encrypt {

    override fun process(document:String): String =
        instance.process(document)

}
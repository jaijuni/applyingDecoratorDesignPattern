package com.meli.study.domain.media.encrypts

import java.time.LocalDate
import java.util.*

class DateEncryptDecorator(
    private val instance: Encrypt
): EncryptDecorator(instance){
    override fun process(document: String) =
        super.process(encrypt(document))


    private fun encrypt(document: String): String =
        document.toCharArray()
            .map { (it + LocalDate.now().dayOfMonth).toString() }
            .map { it.toCharArray()[0] }
            .joinToString {it.toString()}

}
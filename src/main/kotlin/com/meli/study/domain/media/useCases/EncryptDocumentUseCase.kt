package com.meli.study.domain.media.useCases

import com.meli.study.domain.media.encrypts.BinaryEncryptDecorator
import com.meli.study.domain.media.encrypts.DateEncryptDecorator
import com.meli.study.domain.media.encrypts.DefaultEncryptor
import com.meli.study.domain.media.entity.EncryptionMethods
import com.meli.study.domain.media.exceptions.InvalidEncryptionMethod
import jakarta.inject.Singleton

@Singleton
class EncryptDocumentUseCase: EncryptDocument {
    override fun encrypt(document: String, method: EncryptionMethods): String =
        when(method) {
            EncryptionMethods.BINARY -> BinaryEncryptDecorator(DefaultEncryptor()).process(document)
            EncryptionMethods.DATE -> DateEncryptDecorator(DefaultEncryptor()).process(document)
            else -> throw InvalidEncryptionMethod()
        }
}
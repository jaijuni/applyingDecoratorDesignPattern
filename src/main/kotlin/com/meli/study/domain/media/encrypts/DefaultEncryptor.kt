package com.meli.study.domain.media.encrypts

import com.meli.study.domain.media.useCases.EncryptDocument

class DefaultEncryptor: Encrypt {
    override fun process(document: String): String =
        document
}
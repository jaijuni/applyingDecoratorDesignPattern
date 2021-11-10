package com.meli.study.domain.media.useCases

import com.meli.study.domain.media.entity.EncryptionMethods

interface EncryptDocument {
    fun encrypt(document: String, method: EncryptionMethods): String
}
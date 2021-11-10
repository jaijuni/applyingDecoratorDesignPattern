package com.meli.study.domain.media.gateways

import com.meli.study.domain.media.entity.EncryptionMethods

interface MediaGateway {
    fun publish(media: EncryptionMethods, message: String)
}
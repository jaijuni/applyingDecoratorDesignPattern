package com.meli.study.application.entrypoint

import com.meli.study.application.entrypoint.entity.EncryptRouteDTO
import com.meli.study.domain.media.entity.EncryptionMethods
import com.meli.study.domain.media.exceptions.InvalidEncryptionMethod
import com.meli.study.domain.media.useCases.EncryptDocument
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.PathVariable

@Controller("/encrypt")
class EncryptionEntryPoint(
    private val encryptDocument: EncryptDocument
) {
    @Post("/{method}")
    fun encryptRoute(@PathVariable("method") method: EncryptionMethods, @Body body: EncryptRouteDTO ) =
        try {
            print(method)
            print(body.document)
            HttpResponse.ok<String>(encryptDocument.encrypt(body.document, method))
        } catch (ex: InvalidEncryptionMethod) {
            HttpResponse.badRequest<String>("You need to send a valid method")
        }

}
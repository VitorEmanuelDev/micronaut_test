package br.com.zup.autores

import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import javax.validation.*

@Validated
@Controller("/autores")
class CadastroAutorController {

    @Post
    fun cadastra(@Body @Valid request: NovoAutorRequest){

        println(request)

    }

}
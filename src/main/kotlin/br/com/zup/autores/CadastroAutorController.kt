package br.com.zup.autores

import io.micronaut.http.annotation.*

@Controller("/autores")
class CadastroAutorController {

    @Post
    fun cadastra(@Body request: NovoAutorRequest){

        println(request)

    }

}
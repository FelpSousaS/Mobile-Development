package org.example.control

import org.example.business.ConvidadoBusiness
import org.example.entity.Convidado

class Portaria {
    private val convidadoBusiness = ConvidadoBusiness()
    init{
        println("Portaria inicializada" )
        println(controle())
    }
    private fun controle(): String{
        val idade = Console.readInt("Qual a sua idade?")
        val convidado = Convidado(idade = idade)

        if(!convidadoBusiness.isAdult(convidado.idade)){
            return "Negado. Menores de idade não são permintidos!"
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite?")
        if(!convidadoBusiness.validInvitationType(convidado.tipo)){
           return "Negado. Convite inválido."
        }

        convidado.codigo = Console.readString("Qual é o código de convite?")

        if(!convidadoBusiness.validInvitationCode(convidado)){
            return "Negado. Convite inválido."
        }


        return "Bem-vindo! :)"
    }
}

fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()

            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. Convite inválido")
            }
        }
    }
}
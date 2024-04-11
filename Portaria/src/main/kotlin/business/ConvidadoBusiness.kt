package org.example.business

import org.example.entity.Convidado

class ConvidadoBusiness {
    fun validInvitationType(tipoConvite: String) =  (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite != "luxo")

    fun validInvitationCode(convidado: Convidado) = when(convidado.tipo){
        "comum" -> convidado.codigo.startsWith("xt")
        "premium", "luxo" -> convidado.codigo.startsWith("xl")
        else -> false
    }

    fun isAdult(idade: Int) = idade > 18

}
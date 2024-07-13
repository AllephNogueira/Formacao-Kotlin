package org.example

class Jogo {
    // Var pode sofre alterações lembrar do let e const
    var titulo: String = ""
    var capa: String = ""
    // Val nao podemos alterar esse valor vai ser igual uma const
    val descricao = ""



    override fun toString(): String {
        return "Jogo(titulo='$titulo', capa='$capa', descricao='$descricao')"
    }


}
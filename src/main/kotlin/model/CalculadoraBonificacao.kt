package model

import model.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("Nome: ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//    fun registra(gerente: model.Gerente) {
//        this.total += gerente.bonificacao
//    }
//
//    fun registra(diretor: model.Diretor) {
//        this.total += diretor.bonificacao
//    }
}
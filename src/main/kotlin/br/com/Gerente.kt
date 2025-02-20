package br.com

import br.com.Funcionario
import br.com.Gerente
import br.com.testaComportamentosConta
import br.com.testaCondicoes

// class Gerente(
//     val nome: String,
//     val cpf: String,
//     val salario: Double,
//     val senha: Int
// ) {

//     fun bonificacao(): Double {
//         return salario * 0.2
//     }

//     fun autentica(senha: Int): Boolean {
//         if(this.senha == senha){
//             return true
//         }
//         return false
//     }

// }

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario) {
    override fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}
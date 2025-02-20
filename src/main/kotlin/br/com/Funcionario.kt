package br.com

import br.com.Funcionario
import br.com.Gerente
import br.com.testaComportamentosConta
import br.com.testaCondicoes

// class Funcionario(
//     val nome: String,
//     val cpf: String,
//     val salario: Double
// ){
//     fun bonificacao(): Double {
//         return salario * 0.1
//     }
// }

open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    open fun bonificacao(): Double {
        return salario * 0.1
    }
}

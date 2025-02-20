package br.com

import br.com.Funcionario
import br.com.Gerente
import br.com.testaComportamentosConta
import br.com.testaCondicoes

fun main() {
    println("Bem vindo ao Bytebank")
// corrigir o erro abaixo

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao()}")

    if(fran.autentica(1234)){
        println("autenticou com sucesso1")
    } else {
        println("falha na autenticação")
    }
    
    testaLacos()

    val testaa = testaComportamentosConta()

    val testab = testaCondicoes(saldo = 0.0)
}


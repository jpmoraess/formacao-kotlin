fun testaFuncionarios() {
    val joao = Analista(
        nome = "João Pedro",
        cpf = "3842923922",
        salario = 7500.0,
    )

    println("Nome: ${joao.nome}")
    println("CPF: ${joao.cpf}")
    println("Salário: ${joao.salario}")
    println("Bonificação: ${joao.bonificacao}")

    val gerente = Gerente(
        nome = "Andressa",
        cpf = "43434343433",
        salario = 4500.0,
        senha = 1234
    )

    println("Nome: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificacao}")

    if (gerente.autentica(123)) {
        println("Autenticação realizada com sucesso.")
    } else {
        println("Não foi possível realizar a autenticação..........")
    }


    val diretor = Diretor(
        nome = "Diretor",
        cpf = "43434343433",
        salario = 10500.0,
        senha = 1234,
        plr = 1200.0
    )

    if (diretor.autentica(123)) {
        println("Autenticação realizada com sucesso.")
    } else {
        println("Não foi possível realizar a autenticação..........")
    }

    println("Nome: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salário: ${diretor.salario}")
    println("Bonificação: ${diretor.bonificacao}")


    val analista = Analista("John Wick", "45845454545", 8000.00)
    println("Nome: ${analista.nome}")
    println("CPF: ${analista.cpf}")
    println("Salário: ${analista.salario}")
    println("Bonificação: ${analista.bonificacao}")


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(joao)
    calculadora.registra(diretor)
    calculadora.registra(gerente)
    calculadora.registra(analista)

    println("Total de bonificação: ${calculadora.total}")
}
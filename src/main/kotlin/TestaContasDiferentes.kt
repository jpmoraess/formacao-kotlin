fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("João Pedro", 19329)

    val contaPoupanca = ContaPoupanca("Andressa", 39203)

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("Saldo CC: ${contaCorrente.saldo}")
    println("Saldo Poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo CC após saque: ${contaCorrente.saldo}")
    println("Saldo Poupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca)

    println("Saldo CC após transferência: ${contaCorrente.saldo}")
    println("Saldo Poupança após transferência: ${contaPoupanca.saldo}")
}

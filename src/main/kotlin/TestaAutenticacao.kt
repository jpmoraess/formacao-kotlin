fun testaAutenticacao() {
    val gerente = Gerente("João Pedro", "3429323223", 2399.0, 654321)

    val diretor = Diretor("John Wick", "2429323223", 5399.0, 123456, 200.0)

    val cliente = Cliente("McLovin", "3944829328", 252525)

    val sistema = SistemaInterno()

    sistema.entra(gerente, 654321)

    sistema.entra(diretor, 123456)

    sistema.entra(cliente, 252525)
}
class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao MoraesBank")
        } else {
            println("Falha na autenticação")
        }
    }
}
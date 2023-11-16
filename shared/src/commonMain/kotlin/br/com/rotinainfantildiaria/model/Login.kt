package br.com.rotinainfantildiaria.model

class Login(private val email: String, private val senha: String) {
  fun validator(): Boolean = email == "daniele@gmail" && senha == "1234"
}

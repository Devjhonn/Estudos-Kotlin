package SintaxeKotlin.Orientação_a_Objetos.Classes.Pessoa

class Pessoa(
    val nome: String,
    val idade: Int,
    val altura: Float,
    val dataNascimento: String,
){

    fun falar(){
        println("Holá, meu nome é: ${this.nome}")
    }

    fun andar(){
        println("Adando...")
    }

    fun acordar(){
        println("Acordando..")
    }

    fun dormir(){
        print("Indo Dormir")
    }
}
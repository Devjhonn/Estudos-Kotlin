package SintaxeKotlin.Orientação_a_Objetos.Classes

import java.time.LocalDate
//
fun main() {
    val contatos = Contatos(1, "marcos@gmail.com") //id e email são propiedades
    //acessando as propriedades
    println(contatos.id)
    println(contatos.email)
    contatos.email = "Jhon@gmail.com"
    //função membro
    contatos.printId() //

    //Class BOOK
    //val livro = Book() //instanciando a classe book vazia

    //classe Carro
    val carro = Carro("ford", "Mustang", "Vermelho", 1989)

    println(carro.modelo)
    carro.ligar()
}

class Contatos(val id: Int, var email: String){
    //Função membro devem ser declarada dentro do corpo da classe
    fun printId(){
        println("Seu id é: $id")
    }
}

class Book{//podemos instanciar essa classe, mesmo que ela não contenha um corpo, usando seu construtor padrão.
    var titulo: String
    var isbn: Long

    constructor(titulo: String, isbn: Long){
        this.titulo = titulo
        this.isbn = isbn
    }
}

class Carro(
    val marca: String,
    val modelo: String,
    val cor: String,
    val anoFabricacao:Int,
    ){

    fun ligar(){
        println("Ligando")
    }
    fun desligar(){
        println("Desligando")
    }
    fun andar(){
        println("Andandoo")
    }
    fun freia(){
        println("Freiandooo")
    }
}








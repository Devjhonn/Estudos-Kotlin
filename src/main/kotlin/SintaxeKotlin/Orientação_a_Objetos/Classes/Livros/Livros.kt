package SintaxeKotlin.Orientação_a_Objetos.Classes.Livros

class Livros(
    val nome: String,
    val descricao: String,
    val id: String,
    val preco: Double
){

    fun livroInfo(){
        println("====== Informaçẽos Livro ${this.nome} ======")

        println("livro: ${this.nome}")
        println("Descrição: ${this.descricao}")
        println("Id: ${this.id}")
        println("Preço: ${this.preco}")
    }
}
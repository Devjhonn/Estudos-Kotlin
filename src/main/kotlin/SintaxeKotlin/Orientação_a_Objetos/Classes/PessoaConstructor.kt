package SintaxeKotlin.Orientação_a_Objetos.Classes

class PessoaConstructor(val nome: String, val idade: Int) {
    //a classe kotlin já vem com construtor primario por padrão
    // Exemplo de construtor secundário
    //
    var doc: String? = null   //Para acessar doc, precisamos declarar um vaiavel

    constructor(nome: String, idade: Int, doc: String): this(nome, idade){// this- refere-se ao objeto
        //no construtor podemos aplicar lógica
        this.doc = doc
        dormir()
    }


    fun dormir(){
        println("Dormindo....")
    }

    fun acordar(){

    }


}


fun main(){
    val pessoa = PessoaConstructor("Marcos", 28,"6528-956")

    pessoa.doc
    pessoa.acordar()
    pessoa.dormir()
}

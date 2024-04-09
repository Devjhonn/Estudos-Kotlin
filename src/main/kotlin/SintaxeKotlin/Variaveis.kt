package SintaxeKotlin

fun main() {
    val nome = "Marcos" // val não pode ser mudada depois
    var idade = 20 // var pode er mudade e atribuido um novo valor
    println(idade)
    idade = 25
    println(idade)

    //Exercicio

    println("$nome tem $idade anos ")

    //Declarar Variaveis vazias ou sem valor atribuido basta colocar o seu tipo ex: val idade: Int

    val ano: Int
    ano = 2023
    println(ano)

}


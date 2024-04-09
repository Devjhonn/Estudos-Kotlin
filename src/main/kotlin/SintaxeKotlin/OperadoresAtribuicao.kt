package SintaxeKotlin

fun main() {
    var clientes = 8

    /*clientes = clientes + 3 //exemplo de adição: 11
    println(clientes)*/
    clientes += 3 // adição: 11
    println(clientes)

    clientes += 7 //Exemplo de adição: 18
    println(clientes)

    clientes -= 3 // Exemplo de subtração: 15
    println(clientes)

    clientes *= 2 // Exemplo de Multiplicação: 30
    println(clientes)

    clientes /= 3 // Exemplo Divisão: 10
    println(clientes)

    //Exemplos de tipo de dados

    /*
    inteiros = Byte, Int, Short, Long: 1, 20, 513413, 4134134512532, 1535215325125325321, -3, -314314143

    Ponto Flutuante = Double, Float: 4.15, 4.2, 1.6

    Booleanos = true, false

    Characters = Char: 'A'

    Strings =  String "isso é uma string"
     */

}

//Declare explicitamente o tipo correto para cada variável:

fun exercicio( ) {
    val uma: Int = 1000
    val b: String = "mensagem de log"
    val c: Double = 3.14
    val d : Long= 100_000_000_000_000
    val e : Boolean = false
    val f: Char = '\n'
}
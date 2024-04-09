package SintaxeKotlin
/*
* Operadores nos permitem realizar cálculos matemáticos básicos
* (+)  = Adição
* (-) = Subtração
* (/) = Divisão
* (*) = multiplicação
* (%) = Resto da divisão
* */
fun main() {
    soma()
    subtracao()
    divisao()
    multiplicacao()
    restoDivisao()
}

fun soma(){
    val n1 = 10
    val n2 = 5

    val soma = n1 + n2
    println("Soma é: $soma")
}

fun subtracao(){
    val n1 = 5
    val n2 = 2

    val subtracao = n1 - n2
    println("Subtração = $subtracao")
}

fun divisao(){
    val n1 = 10
    val n2 = 5

    val divisao = n1 / n2
    println("Divisão é: $divisao")
}

fun multiplicacao(){
    val n1 = 10
    val n2 = 5

    val multiplicacao = n1 * n2
    println("Multiplicação é: $multiplicacao")
}

fun restoDivisao(){
    var n1 = 10
    var n2 = 5

    var resto = n1 % n2

    println("O resto é: $resto")

    n1 = 10
    n2 = 3

    resto = n1 % n2

    println("O novo Resto é: $resto")
}

package SintaxeKotlin
/*
* Operadore relacionais
* (>) = Maior uqe
* (<) = menor que
* (>=) = maior igual a que
* (<=) = menor igual a que
* (==) = igual a (1 Int ==  1 int) - true
* (!=) = diferente de (1 int != 1 String) - True
* */
fun main() {
    val primeiraVariavel = 1
    val segundaVariavel = 1

    println(">>> A primeira variavel e maior que a segunda?")
    val maiorQue = primeiraVariavel > segundaVariavel

    println(maiorQue)


    println(">>> A Primeira é menor que a segunda? ")
    val menorque = primeiraVariavel < segundaVariavel

    println(menorque)


    println(">>> A primeira é maior ou igual a segunda?")

    val maiorIgual = primeiraVariavel >= segundaVariavel
    println(maiorIgual)

    println(">>> A primeira é menor ou igual a segunda? ")
    val menorIgual = primeiraVariavel <= segundaVariavel
    println(menorIgual)


    println(">>> A primeira é Igual a segunda?")
    val igual = primeiraVariavel == segundaVariavel
    println(igual)

    println(">>> A primeira é diferente da segunda ?")
    val diferente = primeiraVariavel != segundaVariavel
    println(diferente)
}


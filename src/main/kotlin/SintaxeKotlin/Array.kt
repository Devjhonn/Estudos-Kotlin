package SintaxeKotlin

import java.util.*

fun main() {



}

fun arrays(){
    //Array sempre terá um tamanho fixo consiguimos definir e resgatar valores através do indice colchetes([])
    //Não é possivel adicionar novos valores para isso usamos mutablelist
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 50)
    println(arrayInt)

    val x = arrayInt[2]
    println(x)

    println(arrayInt.isEmpty())

    println(arrayInt.isNullOrEmpty())

    println(Arrays.toString(arrayInt)) // imprime o array

    println(arrayInt.sum()) // soma os indices do array

    println(arrayInt.first())// imprime o primerio indice do array

    println(arrayInt.last())//imprime o ultimo indice

    println(arrayInt.count()) // conta elementos do array

    println(arrayInt.filter { it % 2 == 0 })// imprime os numero pares

    arrayInt.shuffle() //embaralha o array
    println(arrayInt.joinToString())
}



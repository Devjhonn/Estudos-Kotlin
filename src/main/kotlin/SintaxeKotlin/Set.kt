package SintaxeKotlin

fun main() {
    //setOf faz parte das colection, como arrayof ou list0f, ele é mais rapido que o array lista mas não mantem a ordem
    // dos elementos e não permite elementos duplicados
    val hash = setOf("a", "b", "C", "C")


    val conjuntoA = hashSetOf<Int>(1,2,3,4,5)
    val conjuntoB = setOf<Int>(6,7,8,9,10)

    println(conjuntoA)
    println(conjuntoB)

    for (conjunto in conjuntoA){
        println(conjunto)
    }
}
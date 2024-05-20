package SintaxeKotlin.colecoesEFuncoes

fun main() {

    val list1: List<Any> = listOf(1,2,3,4,5)
    val list2:MutableList<Int> = mutableListOf(1,2,3,4)

    println(list1)
    println(list2)

    list2.add(0)
    list2.add(9)
    println(list2)
    println(list2.contains(2))
    list2.clear()
    println(list2)
}
package SintaxeKotlin.colecoesEFuncoes

fun main() {
    //distict
    val lst = listOf(1,2,7,7,7,2,2,3,3,4,4,4)
    println(lst.distinct()) //imprime valores unicos, mesmo que tenha varios repeetidos será imprimido apenas um.

    println(lst.sorted()) // Ordena a lista em ordem crescente
    println(lst.sortedDescending())// ordena a lista em ordem decrecente
    println(lst.reversed())//imprime de do ultimo para o primeiro

}
package SintaxeKotlin.colecoesEFuncoes

fun main() {
    val teste: List<Int> = mutableListOf(1,2,3,4,5,6,7)
    println(teste)

    //o take e take last é parecido com o first e last
    //diferença e que aceita o parametro n ou seja consigo pegar os 2/3... primeiro indices do inicio
    // take laste a mesma coisa so que do fim

    println(teste.take(3))//1,2,3
    println(teste.takeLast(2))//7,6
}
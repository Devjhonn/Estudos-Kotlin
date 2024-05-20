package SintaxeKotlin.colecoesEFuncoes

fun main() {
    //Busca o valor minimo ou maximo, combinados com outra função é possivel buscar strings por exemplo
    val minOuMax = mutableListOf(1,2,3,4,5,6,7)

    println("Minimo é : " + minOuMax.min())
    println("Maximo é: " + minOuMax.max())

    //Podemos usar assim tambem
    println(minOuMax.maxOf { it })

    val nomes = listOf("Marcos", "Babi","Zoe", "Johel")

    println(nomes.minWith(compareByDescending { it }))

}
package SintaxeKotlin.`Exceções_ e_NullSafety`

fun main() {
    /* Esse tipo visa eliminar o perigo das referencias nullas

    Para permitir nulos declaramos a variavel escrevendo como abaixo
     */
    var s: String? = "ABC" // pode ser definido como nulo
    println(s)
    s = null
    println(s)


    // Chamadas Seguras

    //Sua segunda opção para acessar uma propriedade em uma variável nula está usando o operador de chamada segura ?.

    val uma = "Kotlin"
    val b: String? = null

    println(b?.length)
    println(uma?.length)//Chamada segura desnecessária
}
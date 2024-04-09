package SintaxeKotlin

fun main() {
    // Implementação chave/valor
    val map = mapOf(
        1 to  "janeiro",
        2 to "fevereiro",
        3 to "Março"
    )

    val products = mapOf(
        "Apple" to "ios",
        "Google" to "Android"
    )

    println(products)
    println(products["Apple"])
    println(products.isEmpty())
    println(products.size)


    val userA = mutableMapOf(
        "Name" to "Marcos",
        "País" to "BR",
        "Cidade" to "Slz"
    )

    //Adicionando/Substituindo o valor/chave
    userA.put("Name", "Babi")
    println(userA)

    userA.put("Bairro", "Turu")
    println(userA)

    //removendo valor
    userA.remove("Bairro")
    println(userA)

    1.hashCode()

    //cada chave possiu um hashcode unico


    val numWord = mapOf(1 to "Um", 2 to "Dois", 3 to "Tres")
    val n  =2

    println("$n é escrito como ${numWord[n]}")
}
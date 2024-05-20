package SintaxeKotlin.colecoesEFuncoes

fun main() {
    val data = gerarDados()

   println(data.any()) //mostra se existe algum resultado, tue ou false
    println(listOf<Int>().any())

    println("Tem elementos? ${if (data.any())"Sim" else "Não"}")
    println("Tenho ${data.count()} elementos") // count retorna a quantidade
}


fun gerarDados(): List<Receita>{
    return listOf(
        Receita(
            "Lasanha", 100,
            listOf(
                Ingrediente("Presunto",5),
                Ingrediente("Queijo",5),
                Ingrediente("Molho de tomate",1),
                Ingrediente("Majericão",5)
            )
        ),

        Receita(
            "Hamburgues", 200,
            listOf(
                Ingrediente("Pão",1),
                Ingrediente("Carne",1),
                Ingrediente("Molho ",1),
                Ingrediente("tomate",3)
            )
        ),
        Receita(
            "Macarronada", 200,
            listOf(
                Ingrediente("Macarrão",1),
                Ingrediente("Carne moida",1),
                Ingrediente("Molho tomate ",1),
                Ingrediente("salsicha",3)
            )
        )
    )
}

data class Receita(val nome: String, val calorias:Int, val ingredientes: List<Ingrediente>)
data class Ingrediente(val nome: String, val quantidade: Int)
package SintaxeKotlin.colecoesEFuncoes

fun main() {
    val data = gerarDados1()
    //First retorna o primeiro elemento do conjunto
    //Last retorna o ultimo elemeto do conjunto

    println("Primeira receita ${data.first()}")
    println("Ultima receita ${data.last()}")

}


fun gerarDados1(): List<Receita1>{
    return listOf(
        Receita1(
            "Lasanha", 100,
            listOf(
                Ingrediente1("Presunto",5),
                Ingrediente1("Queijo",5),
                Ingrediente1("Molho de tomate",1),
                Ingrediente1("Majericão",5)
            )
        ),

        Receita1(
                "Hamburgues", 200,
        listOf(
            Ingrediente1("Pão",1),
            Ingrediente1("Carne",1),
            Ingrediente1("Molho ",1),
            Ingrediente1("tomate",3)
            )
        ),
        Receita1(
                "Macarronada", 200,
        listOf(
            Ingrediente1("Macarrão",1),
            Ingrediente1("Carne moida",1),
            Ingrediente1("Molho tomate ",1),
            Ingrediente1("salsicha",3)
            )
        )
    )
}

data class Receita1(val nome: String, val calorias:Int, val ingredientes: List<Ingrediente1>)
data class Ingrediente1(val nome: String, val quantidade: Int)
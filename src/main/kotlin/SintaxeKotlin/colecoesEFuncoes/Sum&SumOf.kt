package SintaxeKotlin.colecoesEFuncoes

fun main() {
    //Sum() Soma uma lista com numeros
    //SumOf soma o objeto

    val lista: List<Int> = listOf(1, 2, 3, 4, 5)
    println(lista.sum()) // RETORNA A SOMA DA LISTA

    // exemplo com dados, usando o SumOf()
    //não soma as strings ou nada do tipo somente numero
    //nesse exemeplo somaremos as calorias do grupo de receita no total
    println("Total calorias: " + gerarDados2().sumOf {it.calorias})
}

fun gerarDados2(): List<Receita2>{
        return listOf(
            Receita2(
                "Lasanha", 500,
                listOf(
                    Ingrediente2("Presunto",5),
                    Ingrediente2("Queijo",5),
                    Ingrediente2("Molho de tomate",1),
                    Ingrediente2("Majericão",5)
                )
            ),

            Receita2(
                "Hamburgues", 200,
                listOf(
                    Ingrediente2("Pão",1),
                    Ingrediente2("Carne",1),
                    Ingrediente2("Molho ",1),
                    Ingrediente2("tomate",3)
                )
            ),
            Receita2(
                "Macarronada", 250,
                listOf(
                    Ingrediente2("Macarrão",1),
                    Ingrediente2("Carne moida",1),
                    Ingrediente2("Molho tomate ",1),
                    Ingrediente2("salsicha",3)
                )
            )
        )
    }

data class Receita2(val nome: String, val calorias:Int, val ingredientes: List<Ingrediente2>)
data class Ingrediente2(val nome: String, val quantidade: Int)

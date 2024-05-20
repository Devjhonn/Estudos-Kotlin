package SintaxeKotlin.colecoesEFuncoes

fun main() {
    val filterList = gerarDados3()

    println("=============== Filtro calorias =================")
    println(filterList.filter { it.calorias > 500 })
    println("=============== Filtro Nome  =================")
    println(filterList.filter { it.nome == "Lasanha"})

    val mList = setOf("Curso", "Desenvolvedor", "Kotlin", "Coleções", "Curso")
    mList.filter { it.startsWith("C") }.forEach { print(it) }
}


fun gerarDados3(): List<Receita3>{
    return listOf(
        Receita3(
            "Lasanha", 100,
            listOf(
                Ingrediente3("Presunto",5),
                Ingrediente3("Queijo",5),
                Ingrediente3("Molho de tomate",1),
                Ingrediente3("Majericão",5)
            )
        ),

        Receita3(
            "Hamburgues", 200,
            listOf(
                Ingrediente3("Pão",1),
                Ingrediente3("Carne",1),
                Ingrediente3("Molho ",1),
                Ingrediente3("tomate",3)
            )
        ),
        Receita3(
            "Macarronada", 600,
            listOf(
                Ingrediente3("Macarrão",1),
                Ingrediente3("Carne",1),
                Ingrediente3("Molho tomate ",1),
                Ingrediente3("salsicha",3)
            )
        )
    )
}

data class Receita3(val nome: String, val calorias:Int, val ingredientes: List<Ingrediente3>)
data class Ingrediente3(val nome: String, val quantidade: Int)
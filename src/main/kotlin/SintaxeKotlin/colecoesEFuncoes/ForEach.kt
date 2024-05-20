package SintaxeKotlin.colecoesEFuncoes

fun main() {
   // Significa para cada
    //it não pode ser modificado pois é do tipo val
    val listaFoEach = mutableListOf(1,2,3,4,5,6,7)

    listaFoEach.forEach{ println(it)} // é mais consiso que um for mas não é uma estrutura de repetição


    //Caso seja necessário pular um item da lista durante o processamento, podemos usar return@forEach
    println("=========================== Pulando Itens ======================================")
    val listaNomes = mutableListOf("Kotlin", "Java", "Kart", "Angular")
    listaNomes.forEach{
        if (it.startsWith("K")){
            return@forEach
        }
        println("Pulando item Com K $it")
    }

    println("=========================== Exibir Propriedades do objeto  ======================================")
    val estoque = listOf(Estoque("Vinho", 25.0), Estoque("Taça", 15.0))
    estoque.forEach {
        println("${it.code} - ${it.valor}")
    }

    println("=========================== Listas de Listas ======================================")
    //É possível processar essa lista usando a função forEach da lista e depois em cada produto dentro dela
    val listaListas = listOf(
        listOf(ListaCelular("MotoG", 500.0), ListaCelular("S24 Ultra", 2000.0)),
        listOf(ListaCelular("Iphone 14",3000.0), ListaCelular("Xiaomi", 800.0))
    )

    listaListas.forEach {
        it.forEach {
            println("${it.nome} - ${it.preco}")
        }
    }



    //Para evitar confusões como qual it estamos usando, podemos mudar o nome dessa variável, atribuindo a ela melhor sentido em um dado contexto,
    println("======================== Mudando o nome do it ===================")
    val teste = listOf(
        listOf(
            Estoque("Armario", 250.0),
            Estoque("Cama",150.0)
        )
    )


    teste.forEach{ // it continua com o mesmo nome aqui
        it.forEach { Estoque -> println("${Estoque.code} - ${Estoque.valor}")
        }
    }


    println("============== Alterando valor com forEach do objeto ===================")
    teste.forEach {
        it.forEach {
            Estoque -> Estoque.valor += 10.0
            println("${Estoque.code} - ${Estoque.valor}")
        }
    }
}

data class Estoque(var code: String, var valor: Double)
data class ListaCelular(val nome: String, val preco: Double)

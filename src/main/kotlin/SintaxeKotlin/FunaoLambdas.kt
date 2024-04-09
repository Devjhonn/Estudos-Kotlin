package SintaxeKotlin

import java.util.Scanner
import kotlin.math.min
// podemos atribuir um lambda a uma variavel que podemos invocar mais tarde
//Podemos passar uma expreção lambda como parametro para outra função
// Podemos retornar uma expressão lambda de uma função
// Invoque uma expressão lambda por conta propria

fun main() {
    upperCaseString("olá")
    // a mesma função com expressão lambda
    println({string: String -> string.uppercase()} ("hello"))


    //atribuido a uma variavel
    val minuscaula = {str: String -> str.lowercase()}
    println(minuscaula("AAAAAA"))

    passaParaOutraFunçãoFilter()
    passaParaOutraFunçãoMap()


    //======================== TIpos de Função ===========================
    println(maiuscula("lllll")) //

    //======================= lambda usando o when ========================
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2Sec = seconds("Minuto")
    val totalTimeInSeconds = timesInMinutes.map(min2Sec).sum()
    println("Total time is $totalTimeInSeconds secs")


    //invocar separadamente
    println({str: String -> str.uppercase()}("olá"))
}

fun upperCaseString(string: String): String{ // função escrita normalmente
    return string.uppercase()
}




fun passaParaOutraFunçãoFilter(){// Filter()
    val numeros = listOf(1, -2, 3, -4, 5, -6)
    val positivos = numeros.filter { x -> x > 0 }
    val negativos = numeros.filter { x -> x < 0 }

    println(positivos)
    println(negativos)

    //O .filte() função aceita um expressão lambda como predicado
    // {x -> x >0} pega cada elemento da lista e retorna apenas aqueles que são positivos
    //{x -> x < 0} pega cada elemento da lista e retorna apenas os que são negativos
}



fun passaParaOutraFunçãoMap(){
    // o .map() função para transformar itens em uma coleção

    val numeros = listOf(1, -2, 3, -4, 5, -6)
    val dobrou = numeros.map { x -> x *2 }
    val triplicou  = numeros.map { x -> x * 3 }
    println(dobrou)
    println(triplicou)

  //{ x -> x *2 }  pega cada elemento da lista e retorna esse elemento multiplicado por 2
  //{ x -> x * 3 } pega o retorna o elemento da lista multiplicado por 3
}


//função lambda definindo a funcao uppercase- chamamos normalmente na main assim como outras função
val maiuscula:(String) -> String = {string -> string.uppercase()}
//val maiuscula = { str -> str.uppercase() } Não funiona pois é obrigatorio declarar o parametro e retorno



//Este exemplo usa um when expressão para determinar qual expressão lambda é retornada quando toSeconds() é chamado:
fun seconds(tempo: String): (Int) -> Int = when(tempo){
    "Hora" -> {valor -> valor * 60 * 60}
    "Minuto"-> {valor -> valor * 60}
    "Segundo" -> {valor -> valor}
    else -> {valor -> valor}

    //cham os valores na main
}

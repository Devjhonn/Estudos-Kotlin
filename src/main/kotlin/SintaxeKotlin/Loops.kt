package SintaxeKotlin

import kotlin.system.exitProcess

fun main() {
    doWhile()
}

fun lacoFor(){
    val cakes = listOf("carrot", "Cheese", "Chocolate")

    for (cake in cakes){
        println("Yummy, it's a $cake cake!")
    }

    for (numero in 1..5){
        println(numero)
    }

    for(valor in 1..<5){
        println("Valor: $valor")
    }
}

fun lacoWhile(){
    var cakesEaten = 0

    while (cakesEaten < 5){
        println("Comer um bolo")
        cakesEaten++
    }

    //teste pratico while
    var fatiasPizza = 0

    while (fatiasPizza < 8){
        fatiasPizza++
        println("Há apenas $fatiasPizza fatias de pizza :(")

    }
    println("Há $fatiasPizza fatias de pizza. Hoooray! Temos uma pizza inteira")

}

fun doWhile(){
    var cakesEaten = 0
    var cakesBaked = 0

    do{
        println("Faça um bolo")
        cakesBaked++
    }while (cakesBaked < cakesEaten)


    //do While calculando quando ana passara paula em patrimonio
    /*val salario = 10000f
    var patAna = 0f
    var patPaula = 0f
    var mes = 0

    do {
        patAna += (salario * 0.05f) + (salario * 0.05f) + (patAna * 0.002f)
        patPaula += (salario * 0.05f) + (patPaula * 0.008f)
        mes ++

        println("Pat Ana - $patAna -------- pat Paula - $patPaula")
    }while (patAna > patPaula)
    println("Ana - ${patAna * 0.002f}")
    println("Paula - ${patPaula * 0.008f}")
    println("Paula vai passar o patrimonio de Ana no mês $mes")*/

    //teste pratico do-While

    var fatiaPizza = 1
    do {
        println("Há apenas $fatiaPizza fatias de pizza :(")
        fatiaPizza++
    }while (fatiaPizza < 8)
    println("Há $fatiaPizza fatias de pizza. Hoooray! Temos uma pizza inteira")

    println("=========Solução da site=========")
        var pizzaSlices = 0
        pizzaSlices++
        do {
            println("There's only $pizzaSlices slice/s of pizza :(")
            pizzaSlices++
        } while ( pizzaSlices < 8 )
        println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}


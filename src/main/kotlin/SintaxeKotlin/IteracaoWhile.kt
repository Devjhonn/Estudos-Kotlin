package SintaxeKotlin

import java.util.Random
import java.util.Scanner


/*
* O laço while ou (Enquanto) é ultilizado para iterações onde o que importa é
* alcançar uma determinada condição para que o mesmo se encerre.
* */
fun main() {
    adivinhaNumero()
}

fun whileExemplo(){

    var contador = 0

    while (contador < 10){
        println("Iteração de numero: $contador")
        contador++
    }

    println("==================================")
}

fun adivinhaNumero(){
    val scanner = Scanner(System.`in`)
    val random = Random()

    var numeroAleatorio = random.nextInt(10)
    var tentarNovamente = true

    println("Aperte CTRL+C, a qualquer momento, para parar.")
    while (tentarNovamente){
        //println(numeroAleatorio)
        println("Adivinhe o número: ")
        val numero = scanner.nextInt()
        tentarNovamente = numeroAleatorio != numero

        if (tentarNovamente){
            println("Errado")
        }
    }
    println("Parabens! Você adivinhou.")
}



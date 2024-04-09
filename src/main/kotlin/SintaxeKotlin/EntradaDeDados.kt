package SintaxeKotlin

import java.util.Scanner

fun main() {
    //Para capturar o valor que o usuario inseriu ultilizamos o Scanner
    // ou o readline

     decimal()
    numeroInteiro()
    booleano()
}

fun entradaUsuario(){
    val entrada = Scanner(System.`in`) // função scanner


    print("Insira o valor 1: ")
    val numero1 = entrada.nextDouble()

    print("Insira o valor 2: ")
    val numero2 = entrada.nextDouble()

    val soma = numero1 + numero2

    println(soma)
}

fun tipodeDadosString(){
    val scanner = Scanner(System.`in`)

    print(">>> Digite um texto: ")
    val texto = scanner.nextLine()

    println("O texto digitado foi: $texto")

}

fun decimal(){
    val scanner = Scanner(System.`in`)

    print(">> Digite um Decimal: ")
    val numeroDecimal = scanner.nextDouble()

    println("O numero digitado foi: $numeroDecimal")
}

fun numeroInteiro(){
    val scanner = Scanner(System.`in`)

    print("Digite um inteiro: ")
    val numeroInteiro = scanner.nextInt()

    println("Numero inteiro digitado foi: $numeroInteiro")
}

fun booleano(){
    val scanner = Scanner(System.`in`)

    print(">>> Digite um booleano (True ou False): ")
    val numeroBooleano = scanner.nextBoolean()

    println("O booleano digitado foi: $numeroBooleano")
}
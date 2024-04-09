package SintaxeKotlin

fun main() {

}

fun areaQuadrada(){
    var lado = 10
    var area: Int

    area = lado * lado

    println("Q área do quadrado é: $area")
}

fun atribuicao(){
    var numero = 1

    numero += 1
    println(numero)

    numero -= 1
    println(numero)

    numero *= 6
    println(numero)

    numero /= 2
    println(numero.toDouble())

    numero %= 2
    println(numero)

}

fun operadorLogico(){
    val nota = 7
    var frequencia: Int = 60


    if  (nota >= 7 && frequencia >= 70){
        println("Aprovado")
    }else {
        println("Reprovado")
    }
}

fun calculoVelocidadeMedia(){
    println("=== Cálculo da velocidade média ====")

    val distanciaPercorria: Double = 150.0
    println("A distancia percorrida foi de $distanciaPercorria km.")

    val tempoGasto: Double = 1.5
    println("O tempo gasto foi de $tempoGasto horas.")

    val velocidadeMedia = distanciaPercorria / tempoGasto
    println("Velocidade média é de $velocidadeMedia km/h")

}
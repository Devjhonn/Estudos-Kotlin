package SintaxeKotlin.Orientação_a_Objetos.Classes

import SintaxeKotlin.cases
import kotlin.math.PI
import kotlin.math.pow


abstract class Teste2(){
    fun tx(){
        println("teste")
    }
}

abstract class AbstractClass(val exemplo: String) {
    //kotlin não suporta herança multipla, para isso usamos as interfaces
    fun falar(){
        println("Falando")
    }

    fun andar(){
        println("Andando")
    }

    abstract fun dormir()
}


class abstrataTeste(exemplo: String): AbstractClass(exemplo)/*: Teste2() - error*/{
    override fun dormir() {
        print("Dormin")
    }

}


/*Um exemplo comum de uso de uma classe abstrata é em uma aplicação
 que lida com diferentes tipos de formas geométricas, como círculos, retângulos, triângulos etc.
 Nesse caso, uma classe abstrata FormaGeometrica poderia ser definida com métodos abstratos
 para calcular área e perímetro, já que cada forma geométrica pode ter uma fórmula diferente
 para esses cálculos.*/

abstract class FormaGeometrica(){
    abstract fun  calcularArea(): Double
    abstract fun calculaPerimetro(): Double
}


class Circulo(private val raio: Double): FormaGeometrica() /*AbstractClass()*/{
    override fun calcularArea(): Double {
        return PI * raio.pow(2)
    }

    override fun calculaPerimetro(): Double {
        return 2 * PI * raio
    }
}


class Retangulo(private val base: Double, private val altura: Double): FormaGeometrica() {
    override fun calcularArea(): Double {
        return base * altura
    }

    override fun calculaPerimetro(): Double {
        return 2*(base + altura)
    }
}









fun main(){
    //val ex = AbstractClass() // error

    val circulo = Circulo(5.0)
    println("Circulo: ")
    println(circulo.calcularArea())
    println(circulo.calculaPerimetro())

    val retangulo = Retangulo(3.0, 4.0)
    println(" Retangulo")
    println(retangulo.calcularArea())
    println(retangulo.calculaPerimetro())

}
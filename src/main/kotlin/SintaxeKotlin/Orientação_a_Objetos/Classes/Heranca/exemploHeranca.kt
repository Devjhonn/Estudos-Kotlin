package SintaxeKotlin.Orientação_a_Objetos.Classes.Heranca

open class Eletronico1(var marca: String){ // precisa declarar que é uma open class para as classes herdarem
    fun ligar(){}
    fun desligar(){}
}


class Computador1(marca: String): Eletronico1(marca){
    fun intalarSoftware(){}
    fun ponteiroMouse(){}
}





fun main() {
    val c: Computador1 = Computador1("Dell")
    c.ligar()
    c.desligar() // metodos herdados da classe mae eletronico

    c.ponteiroMouse()
    c.intalarSoftware() // metodos da classe computador
}
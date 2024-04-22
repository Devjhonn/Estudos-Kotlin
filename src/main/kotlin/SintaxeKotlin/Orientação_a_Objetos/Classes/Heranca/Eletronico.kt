package SintaxeKotlin.Orientação_a_Objetos.Classes.Heranca
//isso é uma sueper classe
open class Eletronico(var marca: String) {
    fun ligar(){
        println("Ligando .....")
    }
    fun desligar(){
        println("Desligando.......")
    }
}
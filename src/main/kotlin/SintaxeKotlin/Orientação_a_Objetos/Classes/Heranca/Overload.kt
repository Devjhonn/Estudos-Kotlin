package SintaxeKotlin.Orientação_a_Objetos.Classes.Heranca

//overload é a sobrecarga
//basicamente varias funções iguais com parametros diferentes
class Overload {
    fun save(){}
    fun save(a: Int){}
    fun save(a: String){}
    fun save(a:Int, b : String){}
    fun save(a: Boolean){}

}
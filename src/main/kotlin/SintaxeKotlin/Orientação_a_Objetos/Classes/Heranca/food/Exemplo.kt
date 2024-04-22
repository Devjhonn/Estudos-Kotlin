package SintaxeKotlin.Orientação_a_Objetos.Classes.Heranca.food
//super class
open class Food(val preco: Double){

}

//herda caracteristica da super class
class Hamburguer(price: Double, val peso: Double, val nome: String) : Food(price){
}


fun main() {
    val hamburguer: Hamburguer = Hamburguer(17.50,120.0,"Whopper")
    println("Preço: R$ ${hamburguer.preco}")
    println("Nome: ${hamburguer.nome}")
    println("Peso: ${hamburguer.peso}")

}
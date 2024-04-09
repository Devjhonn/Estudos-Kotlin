package SintaxeKotlin;
import java.util.*

/*
* O laço for ou PARA serve para que possamos lidar com as iterações
* onde sabemos o numero de vezes precisamos iterar
*
* for( , , ){}
* */
fun main() {
    carrinhoCompraFor()
}

fun carrinhoCompraFor() {
    val carrinhoCompras = arrayOf(57.0,175.0,25.0,10.0)
    var valorTotalCarrinho = 0.0

    for (index in 0 ..< carrinhoCompras.size){
        valorTotalCarrinho += carrinhoCompras[index]

        println(">>>>>Iteração $index")
        println(">>> Valor do produto Corrente R$ ${carrinhoCompras[index]}")
        println(">>> O total parcial é de R$ $valorTotalCarrinho.")
        println(valorTotalCarrinho)

    }

    println("Valor total do carrinho é R$ $valorTotalCarrinho")
}



package Exercicios

import SintaxeKotlin.Orientação_a_Objetos.Classes.pedido
import java.util.*

fun main() {
    val recebe = Scanner(System.`in`)
    var listaPedido: MutableList<String> = mutableListOf()
    var entrada: Int = 0
    var menu = 0


        println("Seleciona uma das opções!")
        println("1 - Cardápio")
        println("0 - Sair")
        entrada = recebe.nextInt()

        while(entrada != 1 && entrada != 0) {
            println("Escolha uma das opções")
            println("1 - Cardápio")
            println("0 - Sair")
            entrada = recebe.nextInt()
        }

        while (entrada != 0) {
                println("============= Selecione seus pedidos =============")
                println("1 - Arroz com feijão")
                println("2 - Bife acebolado")
                println("3 - Churrasco")
                println("4 - Pizza dobrada")
                println("5 - Ver pedido")
                println("6 - Finalizar  Pedido")
                menu = recebe.nextInt()


                when (menu) {
                    1 -> listaPedido.add("Arroz com feijão")
                    2 -> listaPedido.add("Bife Acebolado")
                    3 -> listaPedido.add("Churrasco")
                    4 -> listaPedido.add("Pizza Dobrada")
                    5 -> {
                        if (listaPedido == emptyList<String>()) {
                            println("Não à pedidos")
                            println()
                            println("1 - Fazer Pedido")
                            println("0 - sair")
                            menu = recebe.nextInt()
                            if (menu == 0) {
                                println("Saindo...")
                                break
                            }
                        }else{
                            println(listaPedido)
                        }
                    }

                    6 -> {
                        println("Pedido Realizado com sucesso!")
                        println(listaPedido)
                        break
                    }
                }
            }
}




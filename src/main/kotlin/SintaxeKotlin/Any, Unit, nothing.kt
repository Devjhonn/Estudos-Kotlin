package SintaxeKotlin

fun main() {
  //any é o tipo de referencia que aceita qualquer tipo de dado
    val numerAny: Any = 10
    val textAny: Any = "10"



    //Unit é uma função que não retrona nada..Ex: o prinln somente sai não retorna
    fun add():Unit{
        val result = 2 + 2
        println(result)
    }

    add()


    //nothing elá não retorna nada e também não termina, não tem fim, ex: exibição de tela, loop infinito
    var count = 0
    fun forever(): Nothing{
        while (true){
            Thread.sleep(1000)
            println("$count %")
            count++
        }
    }

    forever()



}
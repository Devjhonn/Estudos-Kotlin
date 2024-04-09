package SintaxeKotlin.`Exceções_ e_NullSafety`

fun main() {
    val str: String? = null

    if (str == null){
        println("Nulo")
    }else{
        println(str)
    }


    // o elvis e como se fosse esse bloco if, funciona da mesma forma

    println(str ?: "nuloElvis") //caso str seja nulo ele imprime a mensagem, podemos chamar uma função tambem
    println(str ?: soma())

}

fun soma(){
    val n1 = 10
    val n2 = 5

    val soma = n1 + n2

    println(soma)
}
package SintaxeKotlin.`Exceções_ e_NullSafety`

fun main() {
    /*tratamento de exceções try..cath*/

    try {
        val s: String? = null
        println(s!!.length)

    }catch (e: NullPointerException){ // declara uma varialvel do tipo a ser tratado
        println("Variavel nula")
    }catch (e: ArithmeticException){
        println("Impossivel dividir por zero")
    }catch (e: Exception){ //e uma forma generica
        println("Generica")
    }finally {
        println("Finally") //Sempre será executada
    }

    println("Fim")
}
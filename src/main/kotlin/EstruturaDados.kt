import SintaxeKotlin.while1
import java.util.*

fun main() {
}

fun arrays(){
    val vetor = arrayOf(3)
    println(vetor.size)
}

fun ordenação(){
    val lista = listOf(7,5,6,9,2)

    val n = lista.size
    val min = lista[0]

    for (i in 0..n){
        if (lista[i] < min){
            val min = lista[i]
            println(min)
        }

    }
}


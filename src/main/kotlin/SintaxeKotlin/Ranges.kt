package SintaxeKotlin

fun main() {
    // a maneira mais comun de criar o intervalo e usando .. por exemplo 1..10


    for (i in 1..10) {
        println(i)
    }

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 0 until 3) { // o 3 não é considerado
        println(i)
    }


// podemos usar ranges em char
    for ( c in 'a'..'z'){
        print(c)
    }
    println()

    for (c in 'z' downTo 'a' ){
        print(c)
    }
    println()

//alem disso podemos usar os ranges no if
    val x =2
    if (x in 1..5){
        println("x is in range from 1 to 5")
    }

    if (x !in 1..5){
        println("x is not in range 1..5")
    }

}







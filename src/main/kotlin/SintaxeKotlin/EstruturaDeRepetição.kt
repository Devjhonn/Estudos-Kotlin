package SintaxeKotlin

fun main() {
    repeticaoFor()
    repeticaoWhile()
}

fun main2(){
    //Retorno while
    println(while4("xxxooo"))
    println(while4("xxxo"))
    println(while4("fdsfdsfdsf"))
    println(while4("ooooooxxxxxx"))
    // O for é amplamente usado para iterar listas, sendo adequado quando sabemos o número de iterações que queremos

    val lista = listOf(1,2,3,4)

    for (i in lista){
        println("Item: $i")
    }

    for ((indice, valor) in lista.withIndex()){
        println("Indice: $indice valor: $valor")
    }

    val bolos = listOf("Cenoura", "Queijo", "Chocolate")

    for (bolo in bolos){
        println("Gosto, é um bolo de $bolo")
    }


    // O while ele repete um trecho de código enquanto a condição não for satisfeita

    var y = 0
    while (y <= 10){ //repete enquanto y for menor ou igual que 10
        println(y.toString())
        y++
    }
}


fun while1(){
    var baloes = 7
    val caixa = 2000


    var numBaloes = 0
    while ((numBaloes * baloes) + baloes <= caixa) {
        numBaloes++
    }

    println("Cabem $numBaloes na cixa dagua ")
}

fun while2(){
    var num = 1

    while (num <= 50){
        if (num % 3 == 0 && num % 5 == 0){
            println("Fizz Buzz")
        }else if (num % 5 == 0){
            println("Fizz")
        }else if (num % 3 == 0 ){
            println("Buzz")
        }else{
            println(num)
        }
        num++
    }
    println("")
}

fun while3(str: String){
    var i = str.length -1
    while (i >= 0){
        print(str[i])
        i--
    }
}

fun while4(str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0

    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return ((countX == countO) &&(countX != 0))
}


fun repeticaoFor(){
    val lista = listOf(1,2,3,4)

    for (i in lista){
        println("Item: $i")
    }

    for ((indice, valor) in lista.withIndex()){
        println("Indice: $indice valor: $valor")
    }
}

fun repeticaoWhile(){
    var count = 0

    while(count <= 10){
        print(" $count")
        count++
    }



}
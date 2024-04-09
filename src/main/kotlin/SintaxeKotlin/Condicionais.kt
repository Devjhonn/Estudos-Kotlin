package SintaxeKotlin

fun main() {
    imprimePalavraEspecifica()
}
fun main1() {
    //chamada when statement
    cases("Hello")
    cases(1)
    cases(0L)
    cases("hello")

    //Expressão condicional
    codicionalExpression()




    val id: Int
    val verifica = true

    if (verifica){
        id = 1
    }else  {
        id = 2
    }

    // um if não precisa necessariamente de um else
    val a = 10
    val b = 5
    if (a > b){
        println("$a é maior que $b")
    }

    if (a > b){
        println("A é maior que B")
    }else{
        println("B é maior que A")
    }


    val senha = "123"
    if (senha == "123"){
        println("Acesso Concedido")
    }else {
        println("Senha incorreta")
    }

    println(id)

    val n1 = 10
    val n2 = 5

    println( if (n1 > n2){
        n1
    }else{
        n2
    })

    //====== if em uma unica linha============
    val maior = if (a > b) a else b
    println("If em uma linha: $maior")


    //========================WHEN===============================

    var obj = "Hello"

    when(obj){
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else   -> println("Unknow")
    }

    obj = "1"

    val result = when(obj){
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknow"
    }

    println(result)


    val temperatura = 18

    val descricao = when {
        temperatura < 0 -> "Muito Frio"
        temperatura < 10 -> "Um pouco fro"
        temperatura < 20 -> "Quente"
        else  -> "quente"
    }

    println(descricao)

    val x = 10
    when(x){
        in 1..10 -> println("x Está no intervalo")
        else -> println("X está fora do intervalo")
    }


    when(x){
        1 -> println("x = 1")
        2 -> println("X = 2")
        else -> println("N/A")
    }

}

//===============================WHEN STATEMENT ============================
fun cases(obj: Any){
    when(obj){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}


fun codicionalExpression(){
    fun max(a: Int, b: Int) = if (a > b) a else b
    println(max(99, -43))
}

fun whenTeste(){
    val mes = 8

    val mesSelecionado = when(mes){//quando mes for igual a 1 print janeiro
        1 -> "Janeiro" //printa
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês Inválido"
    }

    println(mesSelecionado)

    val temperatura = 18

    val descrição = when{
        temperatura < 0 -> "Muito Frio"
        temperatura < 10 -> "Um pouco Frio"
        temperatura < 20 -> "Quente"
        else -> "Quente "
    }
    println(descrição)


    //teste pratico minha solução
    val botao = "a"
    val acao = when(botao.uppercase()){
        "A" -> "Sim"
        "B" -> "Não"
        "X" -> "Menu"
        "Y" -> "Nada"
        else -> "Não existe esse botão"
    }
    println(acao)

    //solução teste
    println(
        when(botao){
            "A" -> "Sim"
            "B" -> "Não"
            "X" -> "Menu"
            "Y" -> "Nada"
            else -> "Não existe esse botão"
    })
}

fun ifs(){
    val d:Int
    val verifica = true
    if (verifica){//se veririca for verdade d receve valor 1
        d = 1
    }else{ // se não d recebe 2
        d =2
    }
    println("D = $d")



    println("================= FIZZ BUZZ ==============")



}

fun fizzBuzz(){
    for (indice in 1..100){
        println(
        when{
            indice % 3 == 0 && indice % 5 ==0 -> "$indice -> FizzBuzz"
            indice % 3 == 0 -> "$indice -> Fizz"
            indice % 5 == 0 ->  "$indice -> Buzz"
            else   -> indice.toString()
        }
        )
    }

    println("+========================== solução site ====================")
        for (number in 1..100) {
            println(
                when {
                    number % 15 == 0 -> "fizzbuzz"
                    number % 3 == 0 -> "fizz"
                    number % 5 == 0 -> "buzz"
                    else -> number.toString()
                }
            )
        }
}

fun imprimePalavraEspecifica(){
    val palavras = listOf("dinossauro", "limousine", "revista", "linguagem")

    for (indice in palavras) {// lógica estava certa porem errei o metodo startWith
        if (indice.startsWith("l")){
            println(indice)
        }
    }
}
package SintaxeKotlin

import java.util.Scanner

fun main() {
    //valorPadrao("Olá", "Log")
    //valorPadrao("Olá")
    /*println(intevaloDeTempo(1,20,15))
    println(intevaloDeTempo(minutos = 1, segundos = 25))
    println(intevaloDeTempo(horas = 2))
    println(intevaloDeTempo(horas = 1, segundos = 1))*/

    //função nivel superior
    if (checkStatus() == "online"){
        println("enviando mensagem")
    }else{
        println("Está offiline")
    }

    //supFunc
    supFunc(lambda) //helo world
    somaFunc(lambdaSoma)

    val funcaoSoma2 = soma2(15, 5)
    println(funcaoSoma2(2))
}


fun endereco(nome: String, idade: Int, estado: String){
    return println("$nome, tem $idade anos, e mora em $estado ")
}

//N parametros, usamos vararg para passar quantos paramentros que quisermos
fun media(vararg notas: Float):Float{
    var soma = 0f

    for (n in notas){
        soma += n
    }
    return (soma / notas.size)
}
fun soma(n1: Int, n2:Int): Int{
    return n1 + n2
}
fun somaSimplificada(n3: Int, n4:Int) = n3 + n4 //single expression não precisa utilizar return
// o compilador já identifica e define
fun intevaloDeTempo(horas: Int= 0, minutos: Int = 0, segundos: Int = 0) = ((horas * 60) + minutos) * 60 + segundos
fun maiorDeIdade(){
    val scanner = Scanner(System.`in`)
    println("Qual sua idade?")
    val idade = scanner.nextInt()

    if (idade < 18) {
        println("Está acompanhada por responável?")
        val AcompaResponsavel = scanner.next().toString()

         if (AcompaResponsavel.lowercase() == "sim"){
                println("Entrada liberada")
         }else if (AcompaResponsavel.lowercase() != "sim"){
                println("Entrada Negada!")
         }
    }else if (idade == 18 || idade > 18){
        println("Entrada Liberada")
    }
}
fun argumentoNomeados(mensagem: String, prefixo: String){
    println("[$prefixo] $mensagem")
}
fun funcaoSemRetorno(mensagem: String){
    println(mensagem)
    //unidade de retorno é opcional
}
fun valorPadrao(mensagem: String, prefixo: String = "Info") {
    println("[$prefixo] $mensagem")
}




//======================= Função de nível superior ===============
/*Uma função que pode aceitar uma função como parametro ou retornar
uma função é chamada de função de orem superior. ao invez de passar int,String como
 parametro, passaremos uma função anônima ou lambdas. É mais frequente
 passar lambdas como parametros..*/
fun checkStatus():String{
    return "online"
}

//lambda Expression
var lambda = { println("Hello, World")}
val lambdaSoma = {a: Int, b: Int -> a + b}
//Função ordem superior
fun supFunc(lmdb: () -> Unit){ //chamamos a função na mais
    lmdb()
}

fun somaFunc(lmdb: (Int, Int) -> Int){
    var resultado = lmdb(5, 10)
    println("Resultado da soma: $resultado")
}

//passando
fun soma2(x: Int, y: Int): (Int) -> Int{
    return {rst:Int -> x*rst + y}
}


import SintaxeKotlin.intevaloDeTempo
import SintaxeKotlin.soma
import java.awt.Color
import java.util.Scanner
import kotlin.time.measureTime
import kotlin.collections.mutableListOf as mutableListOf

fun main() {

}


fun ex1(){
    val recebe = Scanner(System.`in`)

    println("Entre com a Primeira Nota: ")
    val nota1 = recebe.nextInt()
    println("Entre com a Segunda Nota: ")
    val nota2 = recebe.nextInt()
    println("Entre com a Terceira Nota: ")
    val nota3 = recebe.nextInt()
    println("Entre com a Quarta Nota: ")
    val nota4 = recebe.nextInt()

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    println("Sua Média é: $media")


    if (media == 10){
        println("Aprovado com Excelencia")
    }else if (media >= 7 || media == 7){
        println("Aprovado")
    }else if (media >= 5 && media < 7){
        println("Recuperação")
    }else{
        println("Reprovado")
    }
}

fun ex2(){

    //passando o valor de a para b e vice versa
    var a = 10
    var b = 20
    var c = a

    a = b
    b = c


    println("Valor de a: $a")
    println("Valor de b: $b")
}

fun numeroPrimo(){
    val entrada = Scanner(System.`in`)
    println("Digite um número: ")
    var numero = entrada.nextInt()

    if ((numero % 2 == 0) && (numero !== 2) || (numero == 1)){
        println("Não é primo")
    }else  {
        println("Primo")
    }


}

fun verificaPolindromo(){
    val recebeNome = Scanner(System.`in`)
    println("Digite o Nome:")
    val nome = readLine()

    val nomeContrario = nome?.reversed()

    println(nomeContrario)

    if (nome == nomeContrario){
        println("É polindromo")
    }else {
        println("Não é Polindromo")
    }

}

fun converteTemperatura(){
    val recebeTemp = Scanner(System.`in`)

    println("Escolha a Unidade de temp: ")
    println("1 - Celsius")
    println("2 - Fahrenheit")

    val escolhaUsuario = recebeTemp.nextInt()

    println("Digite a temperatura a ser Convertida: ")
    val temperatura = recebeTemp.nextInt()

    if (escolhaUsuario == 1){
        val temp = temperatura * 1.8 + 32
        println("$temperatura Celsius em Fahrenheit é $temp")
    }else if (escolhaUsuario == 2){
        val temp = (temperatura - 32)/1.8
        println("$temperatura Celsius em Fahrenheit é $temp")
    }

}

fun contarVogais(){

    val vogais = listOf<Char>('a', 'e', 'i', 'o', 'u')

    println("Digite um Nome: ")
    val nome = readLine().toString()

    var contador = 0

    for (caractere in nome){
        if(caractere in vogais){
            contador++
        }
    }

    println("O numero de vogais da palavra é : $contador")
}

fun ordenaLista() {
    val recebeNumero = Scanner(System.`in`)

    val listaOrdenada = mutableListOf<Int>()

    for (indice in 0..10){
        println("Isira a sequencia de Numeros! ")
        val entrada = recebeNumero.nextInt()
        listaOrdenada.add(entrada)
    }

    println("sua lista $listaOrdenada")

    println("1 - Ordenar em ordem Crescente!")
    println("2 - Ordenar em ordem decrescente!")
    val opcao = recebeNumero.nextInt()

    if (opcao == 1){
        listaOrdenada.sort()
        println("Sua lista em ordem Crescente $listaOrdenada")
    }else if (opcao == 2){
        listaOrdenada.sortDescending()
        println("Sua lista em ordem Decrescente $listaOrdenada")
    }else{
        println("Error")
    }
}

fun calculadoraSimples(){
    val entradaUsuario = Scanner(System.`in`)
    val numero = mutableListOf<Double>()

    println("Escolha a Operação Desejada!")
    println("1 - Somar")
    println("2 - Dividir")
    println("3 - Multiplicar")
    println("4 - Subtrair")

    val opcao = entradaUsuario.nextInt()

    for (indice in 1..2){
        println("Insira o valor $indice")
        val n1 = entradaUsuario.nextDouble()
        numero.add(n1)
        indice+1
    }

    if (opcao == 1){
        val soma = numero[0] + numero[1]
        println(soma)
    }else if (opcao == 2){
        val divisao = numero[0] / numero [1]
        println(divisao)
    }else if( opcao == 3){
        val multiplicar = numero[0] * numero [1]
        println(multiplicar)
    }else   if (opcao == 4){
        val subtrair = numero[0] - numero[1]
        println(subtrair)
    }

}

fun listaCompas() {
    val scanner = Scanner(System.`in`)

    val listaCompras = mutableListOf<String>()

    while (true) {
        println("Selecione uma Opção")
        println("1 - Adicionar um  item")
        println("2 - Remover um  Intem")
        println("3 - Exibir lista de compras")
        println("4 - Sair")


        val opcao = readLine()?.toIntOrNull() ?: ""

        when (opcao) {
            1 -> {
                println("Digite o item que deseja adicionar:")
                val item = readLine() ?: ""
                listaCompras.add(item)
                println("$item foi adicionado à lista.")
            }

            2 -> {
                println("Digite o item que deseja remover:")
                val item = readLine() ?: ""
                if (listaCompras.remove(item)) {
                    println("$item removido")
                } else {
                    println("$item não foi encontrado.")
                }
            }

            3 -> {
                if (listaCompras.isEmpty()) {
                    println("A lista está vazia.")
                } else {
                    println("Lista de Compras: ")
                    for (item in listaCompras) {
                        println("${listaCompras.indexOf(item)} - $item")
                    }
                }
            }

            4 -> {
                println("Saindo do programa..")
                return
            }

            else -> {
                println("Opção Invalida.")
            }
        }

    }
}

fun calculaRetangulo(){
    val base = 3
    val altura = 7

    val resultado = base * altura

    println(resultado)
}

fun cadastroAluno(){
    val scanner = Scanner(System.`in`)
    val listaAluno = mutableListOf("")
}

//
fun mediaLista(){
    val recebe = Scanner(System.`in`)
    val numeros = mutableListOf<Double>()

    var count = 1

    while (count <= 5){
        println("Insira uma sequencia de 5 numeros: ")
        val valor = recebe.nextDouble()
        numeros.add(valor)
        count++
    }

    val media: Float = (numeros.sum()/numeros.size).toFloat()
    println(media)

}

fun fatorial(){
    val recebe = Scanner(System.`in`)

    println("insira o numero fatorial desejado: ")
    var numero = recebe.nextInt()

    val numFator = numero
    var fatorial= numero

    while (numero > 1){
        fatorial = fatorial *(numero -1)
        numero --
    }
    println("O fatorial de ${numFator} é: $fatorial")
} // estilizar e acrecentar mais funções

fun SomaDigitosNumero(){
    println("Digite um numero maior que 10: ")
    val recebeNumero = Scanner(System.`in`)

    var numero = recebeNumero.nextInt()
    val digitos = numero.toString().toCharArray()

    


}

    

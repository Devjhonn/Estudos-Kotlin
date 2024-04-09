package SintaxeKotlin

fun main() {
    listas2()
}
fun listas() {
    // Para criar lista de seomente leitura use p list ou listOf
    // Para criar uma lista mutavel use mutableList ou MutableListOf
    // Listas não precisamos declarar o tamanho antecipadamente, posso adicionar valores de acordo com a necessidade
    //Apenas leitura

    var listaLeitura = listOf("Marcos", "Maria", "Barbara")
    val formas = listOf("Triangulo", "Quadrado", "Circulo")
    //lista declarando o tipo deforma explicita
    val forma: MutableList<String> = mutableListOf("Triangulo", "Circulo")

    //Para obter o primeiro ou o ultimo item da lista, .first(), .last()

    println(formas.first())
    println(formas.last())

    //Obtendo numero de itens com .count
    println(forma.count())

    //verificando se um item está na lista in
    println("Quadrado" in formas)

    //Para adicionar ou remover um item ".add(), .remove()"
    forma.add("Retangulo")
    println(forma)
    forma.remove("Retangulo")
    println(forma)

    val apoiado = listOf("HTTP", "HTTPS", "FTP")
    val solicitado = "http"
    val isSupported = solicitado.uppercase() in apoiado


    println("Suporte para $solicitado: $isSupported")


  println("==========Funções: first, last, filter===============")

    val listaTeste = mutableListOf(1, 2, 3, 4)
    val primeiro = listaTeste.first() //retorna o primeiro valor da lista
    println("O primeiro valor da lista é: $primeiro")
    val ultimo = listaTeste.last() // Retorna o ultimo valor da lista
    println("O ultimo valor da lists é : $ultimo")
    val filtroNumerosPares = listaTeste.filter { it % 2 == 0 }// Filter aplica um filtro especifico na lista(Ex: obter os numeros pares)
    println("Os valores pares da lista: $filtroNumerosPares")

}

fun listas2(){
    println("============== LISTAS =============")
    val formas: MutableList<String> = mutableListOf("Triangulo", "Quadrado", "Circulo")

    //evitar mudanças indesejadas, chamado de fundição
    val teste: MutableList<Int> = mutableListOf(1,2,3,4)
    val testeLocked: List<Int> = teste
    println(teste[0])

    //println("<<<< Minha solução para o problema")
    val verdes = listOf(1,4,23)
    val vermelhos = listOf(17,2)

    val totol: List<Int> = verdes + vermelhos
    println(totol.count())

    //println("<<<<Solução correta para o problema")
    val totalCount = verdes.count() + vermelhos.count()
    println(totalCount)

    println("============= SETS =================")

    val noDuplicateValue: Set<Int> = setOf(1,2,2,2,3,4,4,5,1,1)
    println(noDuplicateValue)

    //verifica se o protocolo ou valor está no set
    val apoiado = setOf("HTTPS", "HTTP", "FTP")
    val solicitado = "smtp"
    val isSupported = solicitado.uppercase() in apoiado

    println("Suporte para $solicitado: $isSupported") // mesma solução do enunciado

    println("============== MAP ===============")

    val chaveValor: MutableMap<Int, String> = mutableMapOf(1 to "Janeiro", 2 to "Fevereiro", 3 to "Março")
    println(chaveValor)
    chaveValor.put(4 ,"Abril") // diferente de .add das listas, adicionamos chave/valor com o .put()
    println(chaveValor)
    chaveValor.remove(1)
    println(chaveValor)
    println(chaveValor.containsValue("Abril"))// verifica se contem o valor
    println(chaveValor.containsKey(3))// verifica se contem a chave
    println(chaveValor.keys) // retorna as chaves no map
    println(chaveValor.values) // retorna os valores


    val numero2Word:MutableMap<Int, String> = mutableMapOf(1 to "Um", 2 to "Dois", 3 to "Tres")
    val n = 2

    println("$n está escrito como ${numero2Word[n]}")


}
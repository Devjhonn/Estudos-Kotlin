
import java.util.*

fun main() {
    funcaoHash()
}

fun arrays(){
    val vetor = arrayOf(3)
    println(vetor.size)
}

//========================= Ordenação ==========================
fun recursao(i: Int){
    println(i)
    if (i <= 1){
        return
    }else
    recursao(i - 1)
}

fun recusaoFatorial(x:Int): Int{
    println(x)
    if (x == 1){
        return 1
    }else
        return x * recusaoFatorial(x -1)
}

fun recursivainfi(x: Int){
    //imprimira o valor de x infinitamente
    println(x)
    return recursivainfi(x)
}

fun maxValue(){
    val valores = mutableListOf<Int>(78,5,45,200,21,47,3,4)
}

fun somaLista(): Int{
    val lista = mutableListOf<Int>(5,5,4,7,8)
    var total = 0
    for (x in lista) {
        total += x
    }
    return total

}

fun array(a: Int, b: Int): Int{
    if (a > 0 && b > 0){
    }
    return a + b

}
//============================ Quick Sort =========================
// caso o array seja vazio ou com 1 elemento apenas, já serão o caso base
// exemplo
fun exploIndiceUnico(){
    var array = arrayOf(0)

    if (array.size < 2){
        return println(array.size)
    }
}

fun quickSort(){
}

//============================= Merge Sort ========================




//============================= Tabela Hash ======================
// nás linguagens são conhecidsa com map ou dicionários
fun funcaoHash(){
    val valor = mutableMapOf<String, Double>(
        "Arroz" to 34.67,
        "Feijão" to 5.57,
        "leite" to 5.40,)

    println(valor)
    println(valor["Arroz"])


    var listaTelefonica = mutableMapOf<String, Int>()
    listaTelefonica.put("Marcos", 78456465) // em map adiciona valores usando o .put() ao inver do .add()
    println(listaTelefonica)

    val votaram = mutableMapOf<String, Int>(
        "Marcos" to 1,
        "Barbara" to 2,
        "fulano" to 3,
        "Ciclano" to 4
        )
    //conferindo se o valor ja existe
    println("Qual o nome deseja verificar?")
    val verificaNome = readLine()
    if(verificaNome in votaram){
        println("Manda embora")
    }else
        print("Deixee Votar")

}

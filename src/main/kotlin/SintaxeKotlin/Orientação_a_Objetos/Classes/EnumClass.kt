package SintaxeKotlin.Orientação_a_Objetos.Classes

import java.time.DayOfWeek

// é um tipo de dados que consiste em um conjunto de constantes
enum class StatusPedido(){
    PROCESSANDO,
    APROVADO,
    REPROVADO
}

class Pedido(){
    var status: StatusPedido = StatusPedido.PROCESSANDO
}


enum class Prioridade{
    BAIXA,
    MEDIA,
    ALTA
}
enum class  Prioridade2(val value: Int){
    BAIXA(1){
        override fun toString(): String {
            return "Prioridade Baixa: ${value}" // imprime exatamente isso "no lugar de BAIXA
        }
    },
    MEDIA(2),
    ALTA(3)
}

enum class Animal{
    Cachorro,
    Gato,
    Cavalo,
    Vaca
}

enum class EnumDias(){
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

enum class InicializandoEnumDias(val dayOfWeek: Int){
    //dessa forma a enum está ssociada a número relativo do dia da semana
    //um dos casos mais comuns e fornecer um propriedade printName.
    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7)
}

enum class EnumDiasPrintName(val printName:String){
    ///Fornecendo propriedade printName personalizada
    SEGUNDA("Segunda"),
    TERCA("Terça"),
    QUARTA("Quarta"),
    QUINTA("Quinta"),
    SEXTA("Sexta"),
    SABADO("Sabado"),
    DOMINGO("Domingo")
}

fun main() {
    for (p in Prioridade2.values()){
        println(p)
    }
}

fun pedido(){
    val pedido = Pedido()
    //recebendo novo status
    //pedido.status = StatusPedido.APROVADO

    if (pedido.status == StatusPedido.PROCESSANDO){
        println("Pedido em Processamento")
    }else if (pedido.status == StatusPedido.APROVADO){
        println("Pedido Aprovado...")
    }else {
        println("Pedido Reprovado")
    }
}

fun enunPrioridade(){
    for(p in Prioridade.values()){
        if (p == Prioridade.ALTA)
            println(p)
    }

}

fun InitEnumDias(){
    //Propriedade integal ordinal, é indice 0
    for (dia in InicializandoEnumDias.values()){
        println("[${dia.ordinal}]-> ${dia.name} (${dia.dayOfWeek} ^ dia da semana)")
    }
}
package SintaxeKotlin.colecoesEFuncoes


fun main(){
    //Maneira simples de tirar a média
    //pode ser combianda com outras funções como o map
    val listaMedia = listOf(5,7,3,2,4)

    val media = listaMedia.average()
    println(media)
}
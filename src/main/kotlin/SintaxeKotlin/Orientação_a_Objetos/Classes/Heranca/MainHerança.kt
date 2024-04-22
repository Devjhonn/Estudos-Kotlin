package SintaxeKotlin.Orientação_a_Objetos.Classes.Heranca

fun main() {
    cmmpHeranca()
    noteHerança()
}

fun cmmpHeranca(){
    println("=============== Computador ==================")
    val computador = Computador("Acer")
    computador.ligar()
    computador.gravarDisco()
    computador.instalarSoftware()
    computador.desligar()
}

fun noteHerança(){
    val notebook = Notebook("Samsung", "Core i7")
    println("================== Notebook ==================")
    notebook.abrirTela()
    notebook.ligar()
    notebook.desligar()
    notebook.fecharTela()
    notebook.carregar()
}
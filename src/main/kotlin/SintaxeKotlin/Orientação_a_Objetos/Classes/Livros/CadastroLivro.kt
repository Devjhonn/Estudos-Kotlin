package SintaxeKotlin.Orientação_a_Objetos.Classes.Livros

fun main() {
    val harryPotter: Livros = Livros(
        "Harry potter",
        "Ficção",
        "556-5",
        59.95)
        harryPotter.livroInfo()
        println()

    val bibliaDeVendas: Livros = Livros(
        "Biblia de Vendas",
        "Vendas",
        "565*-2",
        60.51)
        bibliaDeVendas.livroInfo()

}
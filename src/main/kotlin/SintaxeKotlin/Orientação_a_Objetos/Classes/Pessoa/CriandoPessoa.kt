package SintaxeKotlin.Orientação_a_Objetos.Classes.Pessoa

fun main() {
    val jhon: Pessoa = Pessoa(
        "Jhon",
        27,
        163.5F,
        "29/04/1996"
    )
        jhon.falar()
        jhon.acordar()
        jhon.dormir()
}

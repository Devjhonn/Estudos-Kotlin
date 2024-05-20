package SintaxeKotlin.Orientação_a_Objetos.Classes


interface Evento {
    fun onSucess()
}

class Programa{
    fun salvar(e: Evento){
        println("Abrindo conexão:")
        println("Salvando valores")
        println("Sucesso. Conexões fechadas")

        e.onSucess()
    }
}

fun main() {
    val p = Programa()
    p.salvar(object : Evento{
        override fun onSucess() {
            println("Concluido")
        }
    })
}
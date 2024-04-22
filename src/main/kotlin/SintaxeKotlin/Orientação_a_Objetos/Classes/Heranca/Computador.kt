package SintaxeKotlin.Orientação_a_Objetos.Classes.Heranca
// essas são subclasse que herdam os membros presentes em um superclasse
class Computador(marca: String): Eletronico(marca) {
    fun gravarDisco(){
        println("Gravando disco")
    }
    fun instalarSoftware(){
        println("Instalando Software")
    }
}

class Notebook(marca: String,processador: String): Eletronico(marca){
    fun abrirTela(){
        println("tela aberta")
    }
    fun fecharTela(){
        println("Tela fehada")
    }
    fun carregar(){
        println("Carregando...")
    }
}

package SintaxeKotlin.Orientação_a_Objetos.Classes.Heranca
//Usando o override
// override sobrescreve um comportamento
open class Exemplo(p: Int){
    private fun corrente(ativo: Boolean){}

    fun ligar(){
        corrente(true)
        println("Ligando")
    }

    open fun desligar(){ // para usar override a função precisa ser open
        corrente(false)
        println("desligando")
    }
}

class DerivadaExemplo(p: Int): Exemplo(p){
    fun save(){
        println("Salvando")} // vamos supor que eu queira salvar antes de desligar
    //fun desligar(){} //aqui já da erro pedindo o override
    override fun desligar(){
        save()
        super.desligar()// super referencia a classe que deu a herança
    }
}


fun main() {
   val ex: DerivadaExemplo = DerivadaExemplo(15)
    ex.ligar()
    ex.desligar()
}
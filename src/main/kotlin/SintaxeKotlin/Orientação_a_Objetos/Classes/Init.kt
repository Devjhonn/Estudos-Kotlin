package SintaxeKotlin.Orientação_a_Objetos.Classes

class Init(val animal: String) {
    // Init é um codigo que é executado quando a classe e instanciada
    // Podemos ter varios blocos de inits
    //kotlin irá executar todos na sequência
    //um exemplo de init e fazer uma verificação de valores

    var fala: String = ""
    init {
        if (animal == "Cachorro" ){
            fala = "auau"
            println(fala)
        }else if (animal == "Gato"){
           fala = "miau"
            println(fala)
        }
    }

    init {
        println("Exemplo init 2")
    }

    fun falar(){
        println("Falando...")
    }
}

fun main() {
    Init("Cachorro")
    Init("Gato").falar()
}


package SintaxeKotlin.Orientação_a_Objetos.Classes

/*companion object não precisa declara nome, pode ser declarado mas não precisa, além de
* que so é possivel criar apenas um companion object na classe */
//object precisa declarar o nome e podemos declarar varios objects na mesma classe

//ambos so são inicializados quando acessados pela primenira vez

class testeComObj(){

    companion object nome{ //caso precise declarar varia variaveis e funções
        //tem que ser dentro do objetc
        val pi = 3.1415
        fun teste(){}

        init {
            println("Fui inicializado...")
        }
    }

    object test{ //obrigatorio ter nome
        val pi = 3.1415
        fun teste(){}
    }

    object  test2{
        val pi = 3.1415
        fun teste(){}
    }


}



fun main() {
    testeComObj.nome.pi//redudante
    testeComObj.pi

    testeComObj.test.pi // tste object
    testeComObj.test2.pi

   //teste init, só imprimi uma unica vez
    testeComObj.pi
    testeComObj.pi
    testeComObj.pi

}
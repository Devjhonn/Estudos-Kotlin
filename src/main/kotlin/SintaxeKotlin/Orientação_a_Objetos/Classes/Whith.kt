package SintaxeKotlin.Orientação_a_Objetos.Classes

import SintaxeKotlin.Orientação_a_Objetos.Classes.Pessoa.Pessoa

fun main() {
    val pessoa = Pessoa("Babi", 27,1.60F,"29/04/1996")
    pessoa.acordar()
    pessoa.andar() //podemos fazer isso de uma maneira um pouco melhor

    with(pessoa){
        this.acordar()      //bem util, imagina uma variavel grande
        andar()             // pose ser usado com o "this" ou sem
    }                       //não tem diferença de performance
}
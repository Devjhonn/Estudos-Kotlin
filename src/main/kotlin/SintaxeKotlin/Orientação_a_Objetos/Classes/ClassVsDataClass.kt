package SintaxeKotlin.Orientação_a_Objetos.Classes

import javax.xml.crypto.Data

fun main() {
    DataFormaEx()
}
fun formaEx(){
    val f1: Forma = Forma(10,8)
    val f2: Forma = Forma(10,8)
    println(f1.equals(f2))

    println(f1.toString())
    println(f1.hashCode())
    println("-----------")
    println(f2.toString())
    println(f2.hashCode())
}

fun DataFormaEx(){
    val f1: DataForma = DataForma(10,8)
    val f2: DataForma = DataForma(10,8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("-----------")
    println(f2.toString())
    println(f2.hashCode())
}


class Forma(val a: Int, val b:Int){
    override fun equals(other: Any?): Boolean{
        return if (other is Forma){                         //O dataClass já faz tudo isso por padrão
            (other.a == this.a && other.b == this.b)        //Para usar essa funções como equals entre outras temos que implementar
        }else {                                             // se precisarmos desses atribuos o class precisamos declarar tudo na mão
            false
        }
    }

    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}

data class DataForma(val a: Int, val b: Int){
                                                        // Data Class é mais usada para transitar valores
}

//Exemplo
data class Endereco(val rua: String, val cep: String, val cidade: String)
fun endereco( e : Endereco){} /*Ao inves de colocar um monte dee parametro aqui -*/
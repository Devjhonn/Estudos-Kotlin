package SintaxeKotlin.Orientação_a_Objetos.Classes

// no kotlin o get, setters são redundantes mas pode ser usados
class exemplo(var ex: String){
    var fala: String = ""

        get(){
            println("Acesso Get")
            //return fala  // isso faz com que entre em modo recursivo, ou seja uma chamada infinita e para que isso não aconteça usamos o field
            return field // ainda referencia o atributo, mas sem criar a chamada recursiva
        }

    // a mesma coisa acontece com o set
        set(value){
          println("Acesso Set")
         //fala = value // gera a chamada recursiva
         field = value
         }
}

fun getEx(){
    println(exemplo("exemploGet").fala)
}

fun setEx(){
    var a = exemplo("exemplo")
    a.fala = "set agora"
}
fun main() {
    getEx()
    setEx()
}
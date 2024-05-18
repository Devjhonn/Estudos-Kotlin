package SintaxeKotlin.Orientação_a_Objetos.Classes

//Caso precise ou caso tenha um metodo com corpo um exemplo bonus, é mais comun usar as classes abstratas no lugar de interfaces
interface Funcionario{ //Exemplo usando interface
    var salario: Float
    fun bonus(): Float
}

interface CarroPolimorf{
    var modeloCarro: String
    var motor: String
    var zeroACem: Int
    fun tracao(): String
}




class Gerente(override var salario: Float): Funcionario{
    override fun bonus(): Float {
        return salario * 0.5F
    }
}

class Analista(override var salario: Float): Funcionario{
    override fun bonus(): Float{
        return  salario * 0.3F
    }
}

//Poliformismo
fun mostrarBonus(funcionario: Funcionario){ //Recebe a instancia de gerente ou analista, não de funcionário
    println(funcionario.bonus())
}


//Carro
class Suv(override var modeloCarro: String, override var motor:String, override var zeroACem: Int): CarroPolimorf{
    override fun tracao(): String{
        return "4x4"
    }
}

class Sedan(override var modeloCarro: String, override var motor: String, override var zeroACem: Int): CarroPolimorf{
    override fun tracao(): String {
        return "4x2"
    }
}

fun tipoCaroo(carro: CarroPolimorf){ //polimorfismo
    println("Modelo: ${carro.modeloCarro}")
    println("Motor: ${carro.motor}")
    println("0 a 100 em ${carro.zeroACem} Segundos")
    println("Tração: ${carro.tracao()}")
}


abstract class Roupas(var valor: Double, var tamanho: Char, var modelo: String){ //Exemplo Usando abstract class
    abstract fun preco(): Double
}


class Social(valor: Double, tamanho: Char, modelo: String): Roupas(valor, tamanho, modelo) {
    override fun preco(): Double {
        var precoFinal = valor // Inicializa o preço final com o valor base

        // Verifica o tamanho e adiciona o valor correspondente
        if (tamanho == 'M') {
            precoFinal += 3
        } else if (tamanho == 'G') {
            precoFinal += 5
        }
        return precoFinal // Retorna o preço final
    }
}

class Casual(valor:Double,  tamanho: Char,modelo: String): Roupas(valor, tamanho, modelo){
    override fun preco(): Double {
        var precoFinal = valor // Inicializa o preço final com o valor base

        // Verifica o tamanho e adiciona o valor correspondente
        if (tamanho == 'M') {
            precoFinal += 2
        } else if (tamanho == 'G') {
            precoFinal += 4
        }

        return precoFinal // Retorna o preço final
    }
}

fun tipoRoupa(roupas: Roupas){
    println("Modelo: ${roupas.modelo}")
    println("Tamanho: ${roupas.tamanho}")
    println("Valor: ${roupas.preco()}")
}


fun main() {
 roupas()
}

fun mostrarBonus(){
    mostrarBonus(Gerente(5000f))
    mostrarBonus(Analista(4000f))
}

fun tipoCarros(){

    println("======== Carro ======")
    tipoCaroo(Suv("Camaro","V8",5))
    println()
    tipoCaroo(Sedan("Fusion", "2.0T", 8))
    println()
    tipoCaroo(Sedan("Virtus","1.0 Tsi", 12))
}

fun roupas(){
    println("===== Roupas ======")
    tipoRoupa(Social(29.90, 'G',"Social"))
    tipoRoupa(Casual(15.20,'M',"Regata"))

}
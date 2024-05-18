package SintaxeKotlin.Orientação_a_Objetos.Classes

//A interface e um contrato que quando assumido por uma classe deve ser implementado obrigatoriamente
//Interface é utilizada pois podemos ter muitos objetos (classes) que podem possuir a mesma ação (Metodos)
// Porem podem executa-las de maneiras diferentes

interface Pernas{
    fun quantidadePernas()
}

interface Tamanho{
    fun tamanhoMovel()
}


open class Movel{

   open fun pesoMax(){
        println("Peso maximo 30kg")
    }
}

class Mesa: Movel(), Pernas, Tamanho{

    override fun pesoMax(){
        println("60Kg")
    }
    override fun quantidadePernas() {
        println("4 Pernas")
    }

    override fun tamanhoMovel() {
        println("2 Metros")
    }
}


class Cadeira: Movel(), Pernas, Tamanho{
    override fun quantidadePernas() {
        println("3 Pernas")
    }

    override fun tamanhoMovel() {
        println("50cm")
    }
}


//========================== Exemplo 2 ====================================

interface Presidente{
    fun ganharEleicao()
}

interface EnsinoSuperior {
    fun temSuperior()
}

open class Cidadao(val nome: String, val idade: Int){
    fun dados(){
        println("Nome: $nome")
        println("Idade: $idade")
    }
    fun direitosDeveres(){
        println("Todos os cidadãos tem direitos e deveres!")
    }
}


class Obama: Cidadao("Obama", 25), Presidente, EnsinoSuperior{
    override fun ganharEleicao() {
        println("Ganhar Eleição nos EUA")
    }

    override fun temSuperior() {
        println("Tem Superior: Sim")
    }
}

class Jamilton: Cidadao("Jamilton", 36), Presidente, EnsinoSuperior{

    override fun ganharEleicao() {
        println("Ganhar Eleição no Brasil!")
    }
    override fun temSuperior() {
        println("Tem superior: Não")
    }
}









fun main() {
    val mesa = Mesa()
    mesa.pesoMax()
    mesa.quantidadePernas()
    mesa.tamanhoMovel()

    val cadeira = Cadeira()
    cadeira.pesoMax()
    cadeira.quantidadePernas()
    cadeira.tamanhoMovel()

    println("=================================== Cidadao =====================================")
    val obama = Obama()
    obama.dados()
    obama.direitosDeveres()
    obama.temSuperior()
    obama.ganharEleicao()

    println("========================")
    val jamilton = Jamilton()
    jamilton.dados()
    jamilton.direitosDeveres()
    jamilton.temSuperior()
    jamilton.ganharEleicao()

}
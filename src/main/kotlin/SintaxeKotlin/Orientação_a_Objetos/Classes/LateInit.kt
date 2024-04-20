package SintaxeKotlin.Orientação_a_Objetos.Classes

//Precisamos iniciar a variavel seja com um valor vazio ou nulo
//se iniciar ela como nulo precisamos tratar-lo posteriormente
//então é melhor usar o lateinit
//ao chamar o lateinit a variavel precisa ser decalrada com var.
// a variável lateinit só são alocadas em memoria apos sua inicialização

//cenario interessante é quando temos algumas variáveis que precisão rodar alguma lógica antes de receber os dados
class Receita{
   // var instrucoes: String = ""
    lateinit var instrucao: String //será inicializada posteriormente

    fun geraReceita(){
        instrucao = "Lave as mãos"
    }

    fun imprimeReceita(){
        if (!this::instrucao.isInitialized){ //verifica se instrução foi inicializada
            instrucao = "lave as mão 2" // caso não, instrução recebe a string
        }
    }
}


fun main() {
    var r: Receita = Receita()
    r.imprimeReceita()
    println(r.instrucao)
}
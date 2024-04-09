package SintaxeKotlin

/*
* Operadores lógicos trabalham com valores booleanos ou seja true e false
* assim facilita as tomadas de decisão mais complexas dos nosso algoritimos
*
* (&&) = Operador E (1 == 1 $$(E) 2 != 3) - True
* (||) = Operador OU (1 == 2 ||(OU) 2 != 3) - True
* (!) = Negação  ou reversão (Simplesmente pega um valor verdadeiro e tranforma em false
*  */

fun main() {
    val usuarioVIp: Boolean = true
    val compraComValorAlto: Boolean = true
    val menorDeIdade: Boolean = true
    val temProdutoAlcoolicoNoCarrinho: Boolean = true


    println("Usuário é VIP? $usuarioVIp")
    println("A compra é valor alto? $compraComValorAlto")
    println("É menor de idade? $menorDeIdade")
    println("Tem produto alcoólico no carrinho? $temProdutoAlcoolicoNoCarrinho")

    println("=====================================")

    var aplicarDesconto = usuarioVIp && compraComValorAlto
    println("O descomto deve aplicado? (usuarioVIp && compraComValorAlto $aplicarDesconto")

    aplicarDesconto = usuarioVIp || compraComValorAlto
    println("O desconto deve ser aplicado? (usuarioVip || CompraValorAlto: $aplicarDesconto")


    // ler assim, se não for menor de idade ou se nao tiver produto alcoólico
    val permiteComcluirACompra = !menorDeIdade || !temProdutoAlcoolicoNoCarrinho
    println("Pode comcluir a compra?: (!menorDeIdade || !TemProdutoAlcoolico: $permiteComcluirACompra")
}





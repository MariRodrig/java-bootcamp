package ex26singleton;

// Crie uma classe Singleton chamada Carrinho que: -tenha um atributo quantidadeItens, começando em 0;
// -tenha um metodo adicionarItem() que soma 1 à quantidade; -tenha um metodo getQuantidadeItens() que devolve a quantidade.
// Depois, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes, adicione itens usando as duas, e imprima a quantidade final.
// O resultado deve mostrar que as duas telas usam o mesmo carrinho.

public class CarrinhoTeste {
    public static void main(String[] args) {

        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
    }
}

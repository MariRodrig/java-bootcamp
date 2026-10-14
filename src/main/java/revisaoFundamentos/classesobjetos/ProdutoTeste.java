package revisaofundamentos.classesobjetos;

import java.math.BigDecimal;

public class ProdutoTeste {
    public static void main(String[] args) {

        // Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.

        Produto produto = new Produto();

        produto.setNome("Macbook");;
        produto.setPreco(BigDecimal.valueOf(10000));
        produto.setQuantidade(15);

        BigDecimal totalEstoque = produto.getPreco().multiply(BigDecimal.valueOf(produto.getQuantidade()));
        System.out.printf("Valor total em estoque: R$ %.2f%n", totalEstoque);
    }
}

package ex25encapsulamento;

// Crie uma classe Produto com três atributos: codigoInterno (private), nome (default) e preco (public).
// Na Main, instancie um objeto Produto e tente acessar e imprimir os três atributos.
// Observe quais atributos podem ser acessados diretamente e qual apresenta erro de compilação.

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto();
        System.out.println(produto.nome);
        System.out.println(produto.preco);
    }
}

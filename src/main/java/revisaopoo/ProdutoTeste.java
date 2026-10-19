package revisaopoo;

// Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).
// Crie getters e setters para todos os atributos.
// O setter de preco não deve aceitar valores menores ou iguais a zero.
// O setter de quantidade não deve aceitar valores negativos.
// Crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto computador = new Produto();

        computador.setNome("Notebook Dell");
        computador.setPreco(1500);
        computador.setPreco(-10);
        computador.setQuantidade(5);

        System.out.println("Nome do produto: " + computador.getNome());
        System.out.println("Preço do computador: " + computador.getPreco());
        System.out.println("Quantidade em estoque: " + computador.getQuantidade());

    }
}

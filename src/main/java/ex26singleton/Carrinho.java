package ex26singleton;

public class Carrinho {

    private static Carrinho instancia;

    private int quantidadeItens = 0;

    private Carrinho() {
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void adicionarItem() {
        quantidadeItens++;
    }

    public static Carrinho getInstancia() {
        if (instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }
}
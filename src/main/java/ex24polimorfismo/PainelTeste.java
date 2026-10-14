package ex24polimorfismo;

public class PainelTeste {
    public static void main(String[] args) {

        Painel painel = new Painel();

        painel.exibir("Java");
        painel.exibir(25);
        painel.exibir(true);
        painel.exibir(8.5);
    }
}

package ex24polimorfismo;

public class Pix implements MeioDePagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via Pix: R$ %.2f%n", valor);
    }
}

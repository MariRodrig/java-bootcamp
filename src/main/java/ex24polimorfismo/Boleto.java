package ex24polimorfismo;

public class Boleto implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via Boleto: R$ %.2f%n", valor);
    }
}

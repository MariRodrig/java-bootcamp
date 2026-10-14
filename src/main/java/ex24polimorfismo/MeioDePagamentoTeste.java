package ex24polimorfismo;

// Crie uma interface MeioDePagamento com o metodo pagar(double valor).
// Crie as classes Pix e Boleto, implementando a interface MeioDePagamento. Cada classe deve sobrescrever o metodo pagar(),
// exibindo uma mensagem diferente com printf e duas casas decimais.
// Na Main, declare uma única variável do tipo MeioDePagamento
// e utilize-a para realizar pagamentos de R$ 150,00 por Pix e Boleto.

public class MeioDePagamentoTeste {
    public static void main(String[] args) {

        MeioDePagamento forma;

        forma = new Pix();
        forma.pagar(150.00);

        forma = new Boleto();
        forma.pagar(150.00);
    }
}

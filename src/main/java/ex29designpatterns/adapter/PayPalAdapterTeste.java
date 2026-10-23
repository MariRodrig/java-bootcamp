package ex29designpatterns.adapter;

// Crie a interface Pagamento com o metodo pagar().
// Utilize a classe externa PayPalApi, que possui o metodo sendPayment().
// Crie PayPalAdapter para implementar Pagamento e delegar a operação ao PayPalApi.
// No main, demonstre o uso do Adapter e comente a tentativa de usar PayPalApi diretamente como Pagamento.

public class PayPalAdapterTeste {
    public static void main(String[] args) {

        // Pagamento pagamentoDireto = new PayPalApi();

        Pagamento pagamento = new PayPalAdapter(new PayPalApi());
        pagamento.pagar();
    }
}

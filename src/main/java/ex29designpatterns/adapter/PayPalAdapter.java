package ex29designpatterns.adapter;

public class PayPalAdapter implements Pagamento {

    private final PayPalApi api;

    public PayPalAdapter(PayPalApi api) {
        this.api = api;
    }

    @Override
    public void pagar() {
        api.sendPayment();
    }
}

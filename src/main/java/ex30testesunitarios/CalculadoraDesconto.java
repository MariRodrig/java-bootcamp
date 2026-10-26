package ex30testesunitarios;

//  Criar o metodo aplicarDesconto(double valorCompra, boolean clienteVip).
//  Retornar o valor original para compras abaixo de R$ 100,00 de clientes não VIP.
//  Aplicar 10% de desconto para clientes VIP.
//  Lançar IllegalArgumentException para valores iguais ou inferiores a zero.


public class CalculadoraDesconto {

    double aplicarDesconto(double valorCompra, boolean clienteVip) {

        if (valorCompra <= 0) {
            throw new IllegalArgumentException("O valor da compra não pode ser zero ou negativo!");
        }
        if (clienteVip) {
            return valorCompra * 0.90;
        }
        return valorCompra;
    }
}

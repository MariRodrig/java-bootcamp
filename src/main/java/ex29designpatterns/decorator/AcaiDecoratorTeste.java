package ex29designpatterns.decorator;

// Crie a interface Acai com os métodos getDescricao() e getPreco().
// Implemente AcaiSimples e a classe abstrata AcaiDecorator.
// Crie os decorators ComGranola e ComMorango, adicionando descrição e preço.
// No main, teste o açaí com granola e a combinação de granola com morango

public class AcaiDecoratorTeste {
    public static void main(String[] args) {

        Acai pedido1 = new ComGranola(new AcaiSimples());
        System.out.println(pedido1.getDescricao() +  " = R$ " + pedido1.getPreco());

        Acai pedido2 = new ComMorango(new ComGranola(new AcaiSimples()));
        System.out.println(pedido2.getDescricao() + " = R$ " + pedido2.getPreco());
    }
}

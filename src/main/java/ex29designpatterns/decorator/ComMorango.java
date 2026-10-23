package ex29designpatterns.decorator;

public class ComMorango extends AcaiDecorator{

    public ComMorango(Acai acai) {
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola e Morango";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 8.00;
    }
}

package ex29designpatterns.decorator;

public class ComGranola extends AcaiDecorator{

    public ComGranola(Acai acai){
        super(acai);
    }

    @Override
    public String getDescricao() {
        return acaiEmbrulhado.getDescricao() + " + Granola";
    }

    @Override
    public double getPreco() {
        return acaiEmbrulhado.getPreco() + 4.00;
    }
}

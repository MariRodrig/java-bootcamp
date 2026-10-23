package ex29designpatterns.decorator;

public abstract class AcaiDecorator implements Acai{

    protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acaiEmbrulhado) {
        this.acaiEmbrulhado = acaiEmbrulhado;
    }

}

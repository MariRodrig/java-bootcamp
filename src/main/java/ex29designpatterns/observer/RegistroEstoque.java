package ex29designpatterns.observer;

public class RegistroEstoque implements ObservadorEstoque{

    @Override
    public void atualizar(int quantidade) {
        System.out.println( "Nova quantidade: " + quantidade);
    }
}

package ex29designpatterns.observer;

//  Criar uma interface com o metodo atualizar(String status).
//  Implementar ObservadorVoo e exibir o status recebido pelo passageiro.
//  Criar um voo com lista de observadores.
//  Permitir cadastrar observadores e notificá-los ao mudar o status.
//  Implementar ObservadorVoo e exibir o status atualizado no painel.
//  Criar um voo e cadastrar um passageiro e um painel.
//  Alterar o status e verificar se ambos recebem a notificação.

public class ObservadorTeste {
    public static <Observador> void main(String[] args) {

        Voo voo = new Voo("Los Angeles", "Embarque iniciado");

        Passageiro passageiro = new Passageiro();
        PainelAeroporto painel = new PainelAeroporto();

        voo.adicionarObservador(passageiro);
        voo.adicionarObservador(painel);

        voo.mudarStatus("Embarque iniciado");
        voo.mudarStatus("Atrasado");
    }
}

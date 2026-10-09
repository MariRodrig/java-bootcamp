package ex23heranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel{

    void aprovarFerias(String quem){
        System.out.println(nome + " aprovou as férias de " + quem + ".");
    }

    // Faça o Gerente do exercício 5 implementar as duas, SEM tirar o extends Funcionario.

    @Override
    public void notificar(String mensagem) {
        System.out.println(nome + " enviou uma notificação: " + mensagem);
    }

    @Override
    public void exportar() {
        System.out.println(nome + " exportou o relatório.");
    }
}

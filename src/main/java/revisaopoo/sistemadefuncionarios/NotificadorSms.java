package revisaopoo.sistemadefuncionarios;

public class NotificadorSms implements Notificador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação por SMS: " + mensagem);
    }
}

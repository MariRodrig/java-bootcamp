package revisaopoo.sistemadefuncionarios;

public class NotificadorEmail implements Notificador{

    @Override
    public void  notificar(String mensagem){
        System.out.println("Notificação por e-mail: " + mensagem);
    }
}

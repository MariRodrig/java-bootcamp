package ex22interfaces;

public class Email implements Notificacao {

    @Override
    public void enviar(String mensagem){
        System.out.println("Email enviado: " + mensagem);
    }
}
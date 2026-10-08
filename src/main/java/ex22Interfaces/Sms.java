package ex22Interfaces;

public class Sms implements Notificacao {

    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}

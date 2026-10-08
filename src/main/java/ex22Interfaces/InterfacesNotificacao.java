package ex22Interfaces;

import java.util.ArrayList;

public class InterfacesNotificacao {
    public static void main(String[] args) {

     // Adicione as duas num ArrayList<Notificacao> e percorra com for-each, enviando a mesma mensagem.

        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new Sms());

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar("Sua compra foi aprovada!");
        }

    }
}

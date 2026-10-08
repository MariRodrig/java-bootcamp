package ex22interfaces;

// Crie uma interface Notificacao com o metodo enviar(String mensagem).
// Crie duas classes que implementam ela: Email e SMS. Cada uma imprime de um jeito.
// Adicione as duas num ArrayList<Notificacao> e percorra com for-each, enviando a mesma mensagem.

public interface Notificacao {
    void enviar(String mensagem);
}

package ex31lambda;

// Crie duas expressões lambda usando Runnable, que não recebe nem retorna valores.
// Execute ambas em sequência no main utilizando .run().

public class RunnableTeste {
    public static void main(String[] args) {

        Runnable acao = () -> System.out.println("Executando tarefa");
        Runnable acao2 = () -> System.out.println("Finalizando tarefa");

        acao.run();
        acao2.run();
    }
}

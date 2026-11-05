package ex31lambda;

import static ex31lambda.Acao.repetirAcao;

// Crie uma interface funcional Acao com void executar() e um metodo estático repetirAcao(Acao acao).
// No main, passe uma lambda diretamente como argumento para imprimir "Oi" duas vezes.

public class AcaoTeste {
    public static void main(String[] args) {

        repetirAcao(() -> System.out.println("Oi"));
    }
}

package ex31lambda;

// Crie uma interface Operacao com int aplicar(int n) e um metodo estático mostrarResultado() que recebe uma operação e um valor.
// No main, passe três lambdas diretamente como argumentos para calcular o dobro, o quadrado e o negativo de um número.

public class OperacaoTeste {
    public static void main(String[] args) {

       Operacao.mostrarResultado(n -> n * 2, 10);
       Operacao.mostrarResultado(n -> n * n, 10);
       Operacao.mostrarResultado(n -> -n, 10);

    }
}

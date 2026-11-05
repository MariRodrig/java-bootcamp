package ex31lambda;

// Crie uma interface funcional Impressora com void imprimir(String texto).
// Implemente duas lambdas para imprimir o texto em maiúsculas e minúsculas e execute ambas.

public class ImpressoraTeste {
    public static void main(String[] args) {

        Impressora impressora =texto-> System.out.println(texto.toUpperCase());
        impressora.imprimir("hello hello");

        Impressora impressora2 = texto-> System.out.println(texto.toLowerCase());
        impressora2.imprimir("HI HI");
    }
}

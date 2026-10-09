package revisaofundamentos.tratamentoexcecoes;

import java.util.Scanner;

public class ContinuacaoAposExcecao {
    public static void main(String[] args) {

        // Crie um array com 3 nomes e tente imprimir a posição 5.
        // Trate a exceção e, depois do try/catch, imprima "O programa continua funcionando."

        String[] nomes = {"Ana", "Lara", "Lucas"};

        try {
            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida! O array possui apenas 3 nomes (índices de 0 a 2).");
        }
        System.out.println("O programa continua funcionando.");
    }
}

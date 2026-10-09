package revisaofundamentos.tratamentoexcecoes;

import java.util.Scanner;

public class DivisaoPorZero {
    public static void main(String[] args) {

        // Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int primeiroNumero = sc.nextInt();

        System.out.print("Digite mais um número: ");
        int segundoNumero = sc.nextInt();


        try {
            int divisao = primeiroNumero / segundoNumero;
            System.out.println("Resultado da divisão: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro: não é possível dividir por zero.");
        }

    }
}

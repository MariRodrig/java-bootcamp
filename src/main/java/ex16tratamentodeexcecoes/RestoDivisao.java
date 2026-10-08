package ex16tratamentodeexcecoes;

import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {

        // 5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
        // Trate a ArithmeticException para o caso de ela digitar 0.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");

        try {
            int num = sc.nextInt();
            int resto = 100 % num;
            System.out.println("O resto da divisão é: " + resto);

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero. Digite um número válido.");
        }
    }
}

package Ex16TratamentoDeExcecoes;

import java.util.Scanner;

public class EntradaIdade {
    public static void main(String[] args) {

        // 3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número,
        // trate a InputMismatchException e mostre uma mensagem pedindo um número.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");

        try {
            int idade = sc.nextInt();
            System.out.println("A idade informada é de " + idade + " anos.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Digite apenas números.");
        }
    }
}

package ex16tratamentodeexcecoes;

import java.util.Scanner;

public class AcessoNotaArray {
    public static void main(String[] args) {

        // 2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
        // Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

        Scanner sc = new Scanner(System.in);

        int[] notas = {8, 9, 10, 7, 9};
        System.out.print("Digite uma posição: ");

        try {
            int posicao = sc.nextInt();
            System.out.println("A nota dessa posição é: " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: array só vai de 0 até 4.");
        }

    }
}

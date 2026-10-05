package Ex16TratamentoDeExcecoes;

import java.util.Scanner;

public class PosicaoInexistenteArray {
    public static void main(String[] args) {

        // 6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e
        // trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe."
        // Depois do try/catch, imprima "O programa continua funcionando."

        Scanner sc = new Scanner(System.in);

        String[] nomes = {"Ana", "Lara", "Lucas"};

        try {
            System.out.println("O nome dessa posição é: " + nomes[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Essa posição não existe. Digite uma posição válida.");
        }
        System.out.println("O programa continua funcionando.");
    }
}

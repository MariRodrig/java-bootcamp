package revisaofundamentos;

import java.util.Scanner;

public class RevisaoArrays {
    public static void main(String[] args) {

        // Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.

        String[] nomes = {"Geovani", "Leonardo", "Olga", "Luciane", "Fernanda"};

        System.out.println("Primeiro nome é: " + nomes[0]);
        System.out.println("Terceiro nome é: " + nomes[2]);
        System.out.println("Último nome é: " + nomes[4]);

        System.out.println("---------");

        // Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.

        int[] notas = {8, 6, 10, 7, 9};

        for (int nota : notas) {
            System.out.println(nota);
        }

        System.out.println("---------");

        // Com o mesmo array, calcule e imprima a soma e a média.

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        System.out.println("---------");

        // Crie um array com 5 números e descubra qual é o maior.

        int[] numeros = {3, 6, 10, 11, 9};

        int maior = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("Maior número do array: " + maior);

        System.out.println("---------");

        // Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.

        int[] notasAlunos = {8, 5, 10, 4, 7};

        int contador = 0;

        for (int notasAluno : notasAlunos) {
            if (notasAluno >= 7) {
                contador++;
            }
        }

        System.out.println("Total de notas maiores ou iguais a 7: " + contador);

        System.out.println("---------");

        // Mini-desafio — Crie um array com 5 nomes.
        // Peça um nome pra pessoa e diga em qual posição ele está. Se não estiver na lista, avise.

        Scanner sc = new Scanner(System.in);

        String[] nomesClientes = {"Geovani", "Leonardo", "Olga", "Luciane", "Fernanda"};

        System.out.print("Digite um dos nomes na lista: ");
        String nomeDigitado = sc.nextLine();

        int posicao = -1;

        for (int i = 0; i < nomesClientes.length; i++) {
            if (nomesClientes[i].equalsIgnoreCase(nomeDigitado)) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("Nome encontrado no índice: " + posicao);
        } else {
            System.out.println("Nome não encontrado na lista.");
        }
        sc.close();
    }
}



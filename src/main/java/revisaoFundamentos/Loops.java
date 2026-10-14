package revisaofundamentos;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Imprima os números de 1 a 20, um por linha.

        int numero = 20;

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        System.out.println("-----------");

        // Imprima a contagem regressiva de 10 até 1 e depois "Fim!".

        int num = 10;

        for (int i = num; i >= 1 ; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");

        System.out.println("-----------");

        // Peça um número e mostre a tabuada dele de 1 a 10.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = sc.nextInt();

        System.out.println("Tabuada do " + numeroDigitado + ":");

        for (int i = 1; i <= 10 ; i++) {
            int resultado = numeroDigitado * i;

            System.out.println(numeroDigitado + " x " + i + " = " + resultado);
        }

        System.out.println("-----------");

        // Imprima só os números pares de 1 a 30.

        int numeroTrinta = 30;

        for (int i = 1; i <= numeroTrinta ; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("-----------");

        // Usando for, some todos os números de 1 a 100 e mostre o resultado.

        int numSolicitado = 100;
        int soma = 0;

        for (int i = 1; i <= numSolicitado; i++) {
            soma += i;
        }
        System.out.println("Soma dos números de 1 a 100: " + soma);

        System.out.println("-----------");

        // Refaça o primeiro exercício com while. Compare os dois códigos.
        int i = 1;

        while (i <= 20) {
            System.out.println(i);
            i++;
        }

        System.out.println("-----------");

        // Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.

        int energia = 3;

        while (energia > 0) {
            energia--;
            System.out.println("Jogando...  Energia restante: " + energia);
        }
        System.out.println("-----------");

        // Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura:
        // Digite a altura: 5 * ** *** **** *****
        // Você vai precisar de um laço dentro do outro. O de fora controla a linha; o de dentro imprime os asteriscos daquela linha.
        // Repare que a quantidade de asteriscos muda conforme a linha.


        System.out.print("Digite a altura do triângulo: ");
        int altura = sc.nextInt();

        for (int linha = 1; linha <= altura; linha++) {

            for (int asterisco = 1; asterisco <= linha; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
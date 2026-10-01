import java.util.Scanner;

public class Ex13Arrays {
    public static void main(String[] args) {

        // 1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] nomes = {"Ana", "Lara", "Vinicius", "Lucas", "Maria" };
        System.out.println("O primeiro nome é: " + nomes[0]);
        System.out.println("O segundo nome é: " + nomes[2]);
        System.out.println("O primeiro nome é: " + nomes[4]);

        System.out.println("---------");

        // 2 — Crie um array com as notas {8, 6, 10, 7, 9}.
        // Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".

        int[]  notas = {8, 9, 10, 7, 9};
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("---------");

        // 3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        System.out.println("---------");

        // 4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Digite 5 números: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = num.length - 1; i >=0 ; i--) {
            System.out.println(num[i]);
        }

    }
}

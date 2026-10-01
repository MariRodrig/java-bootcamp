import java.util.Locale;
import java.util.Scanner;

public class Ex12Strings {
    public static void main(String[] args) {

        // 1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nome = sc.nextLine();
        System.out.println("O nome contem: " + nome.length() + " caracteres e espaços.");

        // 2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = sc.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // 3 — Peça o nome da pessoa e mostre a primeira letra dele.
        System.out.println("A primeira letra do seu nome é: " + name.charAt(0));


        // 4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();
        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();
        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));

        // 5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        Scanner scann = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome01 = sc.nextLine();
        System.out.println("Digite seu nome novamente:");
        String nome02 = sc.nextLine();
        System.out.println("Os nomes são iguais? "+ nome01.equalsIgnoreCase(nome02));

    }
}

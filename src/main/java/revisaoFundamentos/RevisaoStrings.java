package revisaofundamentos;

import java.util.Locale;
import java.util.Scanner;

public class RevisaoStrings {
    public static void main(String[] args) {

        // Peça o nome completo e mostre quantas letras ele tem.

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.println("Total de letras: " + nomeCompleto.replace(" ", "").length());

        System.out.println("---------");

        // Peça o nome e mostre em MAIÚSCULO e em minúsculo.

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Nome em maiúsculas: " + nome.toUpperCase());
        System.out.println("Nome em minúsculas: " + nome.toLowerCase());

        System.out.println("---------");

        // Peça o nome e mostre a primeira letra.

        System.out.print("Digite seu nome: ");
        String nomeDigitado = sc.nextLine();

        System.out.println("Primeira letra do nome: " +  nomeDigitado.charAt(0));

        System.out.println("---------");

        // Peça uma frase e uma palavra. Diga se a palavra aparece na frase.

        System.out.print("Digite uma frase curta: ");
        String frase = sc.nextLine();

        System.out.print("Agora digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean encontrou = frase.toLowerCase().contains(palavra.toLowerCase());

        System.out.println("A palavra está presente na frase? " + encontrou);

        System.out.println("---------");

        // Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.

        System.out.print("Digite um nome: ");
        String primeiroNome = sc.nextLine();

        System.out.print("Digite msis um nome: ");
        String segundoNome = sc.nextLine();

        if (primeiroNome.equalsIgnoreCase(segundoNome)){
            System.out.println("Nomes são iguais!");
        } else{
            System.out.println("Nomes são diferentes!");
        }

        System.out.println("---------");

        // Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).

        System.out.print("Digite um nome: ");
        String nomeRespondido = sc.nextLine();

        System.out.println("Nome formatado: " + nomeRespondido.toUpperCase().trim());

        System.out.println("---------");

        // Mini-desafio — Peça uma palavra e diga se ela começa e termina com a mesma letra, ignorando maiúscula e minúscula.

        System.out.print("Agora digite uma palavra: ");
        String palavraRespondida = sc.nextLine();

        char primeiraLetra = palavraRespondida.toLowerCase().charAt(0);
        char ultimaLetra = palavraRespondida.toLowerCase().charAt(palavraRespondida.length() - 1);

        if (primeiraLetra == ultimaLetra) {
            System.out.println("A palavra começa e termina com a mesma letra!");
        } else {
            System.out.println("A palavra começa e termina com letras diferentes!");
        }
    }
}

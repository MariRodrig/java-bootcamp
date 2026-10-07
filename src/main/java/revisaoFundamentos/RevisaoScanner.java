package revisaoFundamentos;

import java.util.Locale;
import java.util.Scanner;

public class RevisaoScanner {
    public static void main(String[] args) {

        // Pergunte o nome da pessoa e responda: "Olá, [nome]!"

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Olá, " + nome + ".");

        System.out.println("-----------");

        // Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("A sua idade no próximo aniversário será de " + (idade + 1) + " anos.");

        System.out.println("-----------");

        // Pergunte dois números e mostre a soma.

        System.out.print("Digite um número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite mais um número: ");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;

        System.out.println("A soma dos números é: " + soma);

        System.out.println("-----------");

        // Pergunte a altura e o peso e imprima os dois numa frase.

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("A sua altura e o seu peso são respectivamente: " + altura + " e " + peso + " Kg.");

        System.out.println("-----------");

        // Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto).
        // Depois imprima tudo numa ficha.

        System.out.print("Digite a sua idade: ");
        int idadeUsuario = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.print("Digite a sua cidade de nascimento: ");
        String cidadeUsuario = sc.nextLine();

        System.out.println("Olá meu nome é " + nomeUsuario + ", tenho " + idadeUsuario + " anos e nasci na cidade de " + cidadeUsuario + ".");
    }
}

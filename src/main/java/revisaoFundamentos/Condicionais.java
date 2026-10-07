package revisaoFundamentos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // Peça a idade e diga se a pessoa é maior ou menor de idade.

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Pessoar maior de idade!");
        } else {
            System.out.println("Pessoa menor de idade!");
        }

        System.out.println("-----------");

        // Peça um número e diga se ele é par ou ímpar.

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }

        System.out.println("-----------");

        // Peça dois números e diga qual é o maior. Se forem iguais, avise.

        System.out.print("Digite um número: ");
        int primeiroNumero = sc.nextInt();

        System.out.print("Digite mais um número: ");
        int segundoNumero = sc.nextInt();

        if (primeiroNumero > segundoNumero){
            System.out.println("O maior número é: " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O maior número é: " + segundoNumero);
        } else {
            System.out.println("Os números são iguais.");
        }

        System.out.println("-----------");

        // Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".

        System.out.print("Digite a nota da aluna: ");
        double nota = sc.nextDouble();

        if (nota >= 7){
            System.out.println("Aluna aprovada!");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Aluna em recuperação!");
        } else {
            System.out.println("Aluna reprovada!");
        }

        System.out.println("-----------");

        // Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.

        int opcao;


        System.out.println("---Sabores de sorvete---");
        System.out.println("1 - Chocolate");
        System.out.println("2 - Flocos");
        System.out.println("3 - Menta");

        System.out.print("Escolha um sabor de 1 a 3: ");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> System.out.println("Sabor chocolate");
            case 2 -> System.out.println("Sabor flocos");
            case 3 -> System.out.println("Sabor menta");
            default -> System.out.println("Opção inválida");
        }

        System.out.println("-----------");

        // Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.

        System.out.print("Digite a sua idade: ");
        int idadeUsuario = sc.nextInt();
        double valorIngresso = 25.00;

        if (idadeUsuario < 12 || idadeUsuario > 60){
            System.out.printf("O valor do seu ingresso é: R$ %.2f%n", (valorIngresso - 10));
        }else {
            System.out.printf("O valor do seu ingresso é: R$ %.2f%n", valorIngresso);
        }

        System.out.println("-----------");

        // Mini-desafio — Peça os três lados de um triângulo e classifique:
        // todos iguais → Equilátero; dois iguais → Isósceles; todos diferentes → Escaleno.

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = sc.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = sc.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo equilátero.");

        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo isósceles.");

        } else {
            System.out.println("Triângulo escaleno.");
        }
    }

}

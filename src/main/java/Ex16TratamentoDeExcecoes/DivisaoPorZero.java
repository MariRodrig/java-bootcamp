package Ex16TratamentoDeExcecoes;

import java.util.Scanner;

public class DivisaoPorZero {
    public static void main(String[] args) {

        // 1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo.
        // Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite mais um numero inteiro: ");
        int num2 = sc.nextInt();


        try {
            int resultado = num1 / num2;
            System.out.println(resultado);
        } catch (java.lang.ArithmeticException e){
            System.out.println("Erro: não é possível dividir por zero.");
        }
    }
}

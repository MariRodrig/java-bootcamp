import java.util.Scanner;


//  Faça um programa que use um laço for para contar de 1 até 15. Dentro do for,
//  coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
//  Imprima na tela o número e a palavra correspondente. Ex: "1 é Ímpar", "2 é Par".


public class Ex06LacosDeRepeticao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é um número par!");
            } else {
                System.out.println(i + " é um número ímpar!");
            }
        }
    }
}
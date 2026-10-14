package revisaofundamentos.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplosCatch {
    public static void main(String[] args) {

        // Mini-desafio — Faça um programa com um try e três catch diferentes: um para divisão por zero,
        // um para posição inválida de array e um genérico (Exception) no final.
        // Teste cada situação e veja qual catch é acionado.

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int primeiroNumero = sc.nextInt();

            System.out.print("Digite mais um número: ");
            int segundoNumero = sc.nextInt();

            int resultado = primeiroNumero / segundoNumero;
            System.out.println(resultado);

            int[] numeros = {10, 20, 30};
            System.out.println(numeros[5]);


        } catch (ArithmeticException e){
            System.out.println("Erro: não é possível dividir por zero.");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: posição inválida no array.");

        } catch (Exception e){
            System.out.println("Erro inesperado: " + e.getMessage());
        }

    }
}

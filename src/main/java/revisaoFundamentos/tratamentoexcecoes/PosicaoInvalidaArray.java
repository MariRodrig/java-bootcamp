package revisaofundamentos.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PosicaoInvalidaArray {
    public static void main(String[] args) {

        // Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.

        Scanner sc = new Scanner(System.in);

        int[] notas = {8, 9, 10, 7, 9};
        System.out.print("Digite uma posição: ");

        try {
            int posicao = sc.nextInt();
            System.out.println("A nota dessa posição é: " + notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida! Digite uma posição entre 0 e 4.");

        } catch (InputMismatchException e){
            System.out.println("Erro: digite apenas números inteiros.");
        }
    }
}
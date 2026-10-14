package revisaofundamentos.tratamentoexcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaInvalidaScanner {
    public static void main(String[] args) {

        // Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");

        try {
            int idade = sc.nextInt();
            System.out.println("Idade informada: " + + idade);
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números.");
        }
    }
}

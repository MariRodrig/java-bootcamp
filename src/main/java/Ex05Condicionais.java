import java.util.Locale;
import java.util.Scanner;

//  01. Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
//  Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00.
//  No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.


public class Ex05Condicionais {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do lanche interessado:");
        String lanche = sc.nextLine();

        System.out.println("Digite o seu valor:");
        double preco = sc.nextDouble();

        if (preco > 30.00) {
            System.out.printf("O lanche %s custa:  %.2f%n", lanche, (preco - 5.00));
        } else {
            System.out.printf("O lanche %s custa:  %.2f%n", lanche, preco);
        }

        sc.close();
    }
}

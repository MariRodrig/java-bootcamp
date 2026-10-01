

import java.util.Scanner;


// Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
// 1 - Ver camisas | 2 - Ver calças e 3 - Sair
// Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise.
// O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.


public class Ex07MenuInterativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" ----MENU----");
            System.out.println("1 - Camisas");
            System.out.println("2 - Calças");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Opção camisas confirmada com sucesso!");
                case 2 -> System.out.println("Opção calças confirmada com sucesso!");
                case 3 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opção inválida!");

            }

        } while (opcao != 3);
        sc.close();
    }
}

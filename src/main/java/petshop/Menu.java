package petshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CadastroPet cadastro = new CadastroPet();

        int opcao = 0;

        do {
            System.out.println("=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar por nome do pet");
            System.out.println("4 - Ver espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo pet");
            System.out.println("7 - Executar serviços do pet");
            System.out.println("0 - Sair");

            try {
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1 -> cadastro.cadastrarPet(sc);
                    case 2 -> cadastro.listarPets();
                    case 3 -> cadastro.buscarPet(sc);
                    case 4 -> cadastro.listarEspecies();
                    case 5 -> cadastro.entrarFilaBanho(sc);
                    case 6 -> cadastro.atenderProximoPet();
                    case 7 -> cadastro.executarServicos(sc);
                    case 0 -> System.out.println("Encerrando o programa...");
                    default -> System.out.println("Opção inválida. Digite uma das opções válidas.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números! ");
                sc.nextLine();
            }
        }
        while (opcao != 0);

        sc.close();
    }
}

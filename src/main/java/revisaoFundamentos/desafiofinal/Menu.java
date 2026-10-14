package revisaofundamentos.desafiofinal;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CatalogoFilmes cadastro = new CatalogoFilmes();

        int opcao;

        do {

            System.out.println("=== MEU CATÁLOGO ===");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Buscar por título");
            System.out.println("4 - Estatísticas");
            System.out.println("5 - Sair");

            try {
                opcao = Integer.parseInt(sc.nextLine());

                switch (opcao) {
                    case 1 -> cadastro.cadastrarFilme(sc);
                    case 2 -> cadastro.listarFilmes();
                    case 3 -> cadastro.buscarFilme(sc);
                    case 4 -> cadastro.mostrarEstatisticas();
                    case 5 -> System.out.println("Encerrando o catálogo. Até logo!");
                    default -> System.out.println("Opção inválida.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números! ");
                opcao = 0;
            }
        } while (opcao != 5);
        sc.close();
    }
}
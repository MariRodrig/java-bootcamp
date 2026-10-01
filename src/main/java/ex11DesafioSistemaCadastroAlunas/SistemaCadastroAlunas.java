package ex11DesafioSistemaCadastroAlunas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. Crie uma classe Aluna com cinco atributos: nome, nota, nota2, media e passou (passou sendo boolean).
// 2. Toda informação fica nos atributos do objeto. O valor lido vai direto pro atributo: aluna.nota = sc.nextDouble().
// 3. Use while para manter o programa rodando até a pessoa escolher sair.
// 4. Use switch para tratar as opções do menu. Todos os casos precisam de break, e precisa ter um default.
// 5. Instancie a Aluna dentro do loop, no momento do cadastro. Cada volta cria uma aluna nova.
// 6. Calcule a média dentro do programa. Nada de pedir a média pronta pra pessoa.
// 7. Use if / else para definir se a aluna passou. A média mínima para aprovação é 6. Se a média for 6 ou mais, passou recebe true; se for menor, recebe false.
// O programa decide sozinho — não pergunte isso para a pessoa.
// 8. Use printf para mostrar o resultado.


public class SistemaCadastroAlunas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        List<Aluna> alunas = new ArrayList<>();

        while (opcao != 2) {

            System.out.println("---MENU INICIADO---");
            System.out.println("Pressione: 1 - Continuar |  2 - Sair: ");
            opcao = sc.nextInt();


            switch (opcao) {

                case 1 -> {
                    Aluna aluna = new Aluna();
                    System.out.print("Digite a primeira nota da aluna: ");
                    aluna.nota1 = sc.nextDouble();

                    while (aluna.nota1 < 0 || aluna.nota1 > 10) {
                        System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        aluna.nota1 = sc.nextDouble();
                    }

                    System.out.print("Digite a segunda nota da aluna: ");
                    aluna.nota2 = sc.nextDouble();
                    while (aluna.nota2 < 0 || aluna.nota2 > 10) {
                        System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                        aluna.nota2 = sc.nextDouble();
                    }

                    System.out.print("Digite o nome da aluna: ");
                    sc.nextLine();
                    aluna.nome = sc.nextLine();

                    aluna.media = (aluna.nota1 + aluna.nota2) / 2;
                    String resultado;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                        resultado = "aprovada";
                    } else {
                        aluna.passou = false;
                        resultado = "reprovada";
                    }
                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, sua média final foi %.1f. Aluna foi %s.%n"
                            , aluna.nome, aluna.nota1, aluna.nota2, aluna.media, resultado);

                    alunas.add(aluna);
                    System.out.println("Total de alunas cadastradas até agora: " + alunas.size());
                }
                case 2 -> System.out.println("Encerrando o sistema. Até logo!");

                default -> System.out.println("Opção inválida.");
            }
        }
    }
}


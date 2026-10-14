package revisaofundamentos.desafiofinal;

import java.util.Scanner;

public class CatalogoFilmes {

    Scanner sc = new Scanner(System.in);

    Filme[] filmes = new Filme[5];
    int total = 0;

    public void cadastrarFilme(Scanner sc) {

        if (total >= filmes.length) {
            System.out.println("Limite de 5 filmes atingido.");
            return;
        }

        System.out.println("Nome do filme:");
        String nome = sc.nextLine();

        System.out.println("Gênero do filme:");
        String genero = sc.nextLine().toUpperCase();

        System.out.println("Nota para o filme:");
        double nota = sc.nextDouble();
        sc.nextLine();

        String classificacao = classificarFilme(nota);
        System.out.println("Classificação do filme: " + classificacao);

        Filme filme = new Filme(nome, genero, nota, classificacao);

        filmes[total] = filme;
        total++;

        System.out.println("Filme cadastrado com sucesso!");
        System.out.println("Total de filmes cadastrados: " + total);
    }

    public String classificarFilme(double nota) {

        if (nota >= 8) {
            return "Ótimo";
        } else if (nota >= 5 && nota <= 7.9) {
            return "Bom";
        } else {
            return "Ruim";
        }
    }

    public void listarFilmes() {

        if (total == 0) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }
        for (int i = 0; i < total; i++) {

            Filme filme = filmes[i];

            System.out.println(filme.getTitulo() + " [" + filme.getGenero() + "] - Nota " +
                    filme.getNota() + " - " + filme.getClassificacao());
        }
    }

    public void buscarFilme(Scanner sc) {

        System.out.println("Digite o título do filme: ");
        String titulo = sc.nextLine();

        for (int i = 0; i < total; i++) {

            Filme filme = filmes[i];

            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Filme encontrado: " + filme.getTitulo() + " [" + filme.getGenero() + "] - Nota " +
                        filme.getNota() + " - " + filme.getClassificacao());
                return;
            }
        }
        System.out.println("Filme não encontrado.");
    }

    public void mostrarEstatisticas() {

        if (total == 0) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }
        double somaNotas = 0;
        double maiorNota = Double.NEGATIVE_INFINITY;
        String tituloMaiorNota = "";
        int contadorOtimos = 0;

        for (int i = 0; i < total; i++) {

            Filme filme = filmes[i];

            somaNotas += filme.getNota();

            if (filme.getNota() > maiorNota) {
                maiorNota = filme.getNota();
                tituloMaiorNota = filme.getTitulo();
            }

            if (filme.getClassificacao().equals("Ótimo")) {
                contadorOtimos++;
            }
        }
        double media = somaNotas / total;

        System.out.println("Total de filmes cadastrados: " + total);
        System.out.printf("Média das notas: %.2f%n", media);
        System.out.println("Filme com maior nota: " + tituloMaiorNota);
        System.out.println("Quantidade de filmes ótimos: " + contadorOtimos);
    }
}

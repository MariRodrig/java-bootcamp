package revisaofundamentos.classesobjetos;

public class JogadoraTeste {
    public static void main(String[] args) {

        // Mini-desafio — Crie uma classe Jogadora com nome e pontos.
        // Crie três jogadoras com pontuações diferentes e descubra qual tem a maior pontuação. Imprima o nome dela.

        Jogadora jogadora = new Jogadora();

        jogadora.setNome("Diana");
        jogadora.setPontos(56);

        Jogadora jogadora2 = new Jogadora();

        jogadora2.setNome("Michelle");
        jogadora2.setPontos(70);

        Jogadora jogadora3 = new Jogadora();

        jogadora3.setNome("Loren");
        jogadora3.setPontos(45);

        Jogadora vencedora = jogadora;

        if (jogadora2.getPontos() > vencedora.getPontos()) {
            vencedora = jogadora2;
        }
        if (jogadora3.getPontos() > vencedora.getPontos()) {
            vencedora = jogadora3;
        }
        System.out.println("Jogadora com maior pontuação: " + vencedora.getNome());
    }
}
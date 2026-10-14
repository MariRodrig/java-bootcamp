package ex24polimorfismo;

public class Professora extends Pessoa {

    String disciplina;

    void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s.%n", nome, nota, aluna);
    }
}

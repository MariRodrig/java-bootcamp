package ex23heranca;

public class Professora extends Pessoa{

    String disciplina;

    void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s.%n", nome, nota, aluna);
    }

    void apresentar(){
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
    }
}

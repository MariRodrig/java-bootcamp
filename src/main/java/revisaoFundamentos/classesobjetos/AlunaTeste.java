package revisaofundamentos.classesobjetos;

public class AlunaTeste {
    public static void main(String[] args) {

        // Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.

        Aluna aluna = new Aluna();

        aluna.setNome("Jeniffer");
        aluna.setNota1(6.5);
        aluna.setNota2(9);


        double totalNota = aluna.getNota1() + aluna.getNota2();

        double media = aluna.calcularMedia();

        System.out.printf("Média da aluna %s: %.2f%n", aluna.getNome(), media);

    }
}

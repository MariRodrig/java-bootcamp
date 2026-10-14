package ex24polimorfismo;

public class ProfessoraTeste {
    public static void main(String[] args) {

        Professora professora = new Professora();

        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Java e IA";

        Aluna aluna = new Aluna();

        aluna.nome = "Mari";
        aluna.idade = 33;

        professora.lancarNota(aluna.nome, 9.5);
    }
}

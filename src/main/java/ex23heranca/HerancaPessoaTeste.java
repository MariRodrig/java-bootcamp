package ex23heranca;

public class HerancaPessoaTeste {
    public static void main(String[] args) {

        // Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().

        Aluna aluna = new Aluna();

        aluna.nome = "Larissa";
        aluna.idade = 33;
        aluna.curso = "Análise de sistemas";

        aluna.apresentar();
        aluna.estudar();

        System.out.println("-------");

        Professora professora = new Professora();

        professora.nome = "Flora";
        professora.idade = 35;
        professora.disciplina = "Java";

        professora.apresentar();
        professora.lancarNota(aluna.nome, 9.5);


    }
}

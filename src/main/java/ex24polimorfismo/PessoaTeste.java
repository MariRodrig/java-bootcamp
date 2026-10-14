package ex24polimorfismo;

// Crie um metodo mostrarFicha() que receba um objeto do tipo Pessoa e execute o metodo apresentar().
// Na Main, crie objetos das classes Aluna, Professora e Estagiaria, atribua valores aos seus atributos e chame mostrarFicha() para cada um.

public class PessoaTeste {

    static void mostrarFicha(Pessoa p) {
        p.apresentar();

    }

    public static void main(String[] args) {

        Pessoa estagiaria = new Estagiaria();

        estagiaria.nome = "Lara";
        estagiaria.idade = 28;

        mostrarFicha(estagiaria);

        Pessoa aluna = new Aluna();

        aluna.nome = "Fernanda";
        aluna.idade = 34;

       mostrarFicha(aluna);

        Pessoa professora = new Professora();

        professora.nome = "Luciane";
        professora.idade = 40;

        mostrarFicha(professora);
    }
}

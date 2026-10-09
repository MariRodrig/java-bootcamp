package ex23heranca;

// Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.

public class Aluna extends Pessoa {


    // Acrescente na Aluna o atributo curso e o metodo estudar(), que imprime "[nome] está estudando [curso]."

    String curso;

    void estudar() {
        System.out.println(nome + " está estudando " + curso + ".");
    }
}

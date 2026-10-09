package ex23heranca;

public class Pessoa {

    // Crie a classe Pessoa com os atributos nome e idade, e o metodo apresentar(),
    //  que imprime "Oi, sou [nome] e tenho [idade] anos."

    String nome;
    int idade;

     void apresentar(){
        System.out.println("Oi, sou " + nome + " e tenho " + idade + " anos.");
    }
}

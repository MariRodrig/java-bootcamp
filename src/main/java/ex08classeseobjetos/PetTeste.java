package ex08classeseobjetos;

//  Crie uma classe chamada Pet.
//  Dê a ela três atributos: nome (String), raca (String) e peso (double).
//  Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
//  Atribua valores para os atributos de cada um deles.
//  Imprima os dados dos dois pets concatenando textos e variáveis.

public class PetTeste {
    public static void main(String[] args) {

        Pet pet = new Pet("Alfredo", "Bulldog", 13);
        Pet pet1 = new Pet("Cecilia", "Dogue Alemao", 37);

        System.out.printf("%s é um pet da raça %s e pesa %.2f Kgs. %n", pet.nome, pet.raca, pet.peso);
        System.out.printf("%s é um pet da raça %s e pesa %.2f Kgs. %n", pet1.nome, pet1.raca, pet1.peso);


    }
}

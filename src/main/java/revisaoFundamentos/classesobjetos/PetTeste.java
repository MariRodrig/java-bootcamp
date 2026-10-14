package revisaofundamentos.classesobjetos;

public class PetTeste {
    public static void main(String[] args) {

        Pet pet = new Pet();
        pet.setNome("Alfredo");
        pet.setRaca("Bulldog");
        pet.setPeso(13);

        System.out.println("Nome: " + pet.getNome() + " | Raça: " + pet.getRaca() + " | Peso: " + pet.getPeso() + " kg.");

        System.out.println("-----------");

        // Continuando, crie dois pets diferentes e imprima as duas fichas.

        Pet pet2 = new Pet();

        pet2.setNome("Briana");
        pet2.setRaca("American Bully");
        pet2.setPeso(18);

        System.out.println("Nome: " + pet2.getNome() + " | Raça: " + pet2.getRaca() + " | Peso: " + pet2.getPeso() + " kg.");

        Pet pet3 = new Pet();

        pet3.setNome("Charles");
        pet3.setRaca("Dogue Alemão");
        pet3.setPeso(45);

        System.out.println("Nome: " + pet3.getNome() + " | Raça: " + pet3.getRaca() + " | Peso: " + pet3.getPeso() + " kg.");

    }
}

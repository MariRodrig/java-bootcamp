package petshop;

import java.util.*;

public class CadastroPet {

    private Pet[] pets = new Pet[5];
    private int contador = 0;
    private Deque<String> filaPets = new ArrayDeque<>();

    public void exibirFicha(Pet pet) {
        System.out.println("Nome: " + pet.getNome());
    }

    public void exibirFicha(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Espécie: " + pet.getEspecie());
        System.out.println("Peso: " + pet.getPeso() + " kg");
        System.out.println("Porte: " + pet.getPorte());
    }

    public void cadastrarPet(Scanner sc) {

        if (contador >= pets.length) {
            System.out.println("Limite de pets cadastrados atingido.");
            return;
        }

        System.out.print("Digite a espécie do seu pet: ");
        String especie = sc.nextLine();

        Pet pet;

        if (especie.equalsIgnoreCase("Cachorro")){
            pet = new Cachorro();
        } else if (especie.equalsIgnoreCase("Gato")) {
            pet = new Gato();
        } else {
            pet = new Pet();
        }

        pet.setEspecie(especie);

        System.out.println("===FICHA DO PET===");
        System.out.print("Digite o nome do seu pet: ");
        pet.setNome(sc.nextLine());

        System.out.print("Digite a raça do seu pet: ");
        pet.setRaca(sc.nextLine());

        System.out.print("Digite o peso dele: ");
        pet.setPeso(sc.nextDouble());
        sc.nextLine();

        pet.setPorte(pet.definirPorte());

        pets[contador] = pet;
        contador++;

        System.out.println("Total de pets cadastrados: " + contador);

    }

    public void listarPets() {
        if (contador == 0) {
            System.out.println("Nenhum pet cadastrado.");
            return;
        }
        System.out.println("--- PETS CADASTRADOS ---");
        for (int i = 0; i < contador; i++) {
            Pet pet = pets[i];

            exibirFicha(pet);
            System.out.println("---");
            exibirFicha(pet, "=== FICHA DO PET ===");

            pet.emitirSom();
        }
    }

    public void buscarPet(Scanner sc) {
        System.out.print("Digite o nome do pet: ");
        String nomePet = sc.nextLine();

        for (int i = 0; i < contador; i++) {
            Pet pet = pets[i];

            if (pet.getNome().equalsIgnoreCase(nomePet)) {
                System.out.println("Encontrado: " + pet.getNome() + " - " + pet.getPeso());
                return;
            }
        }
        System.out.println("Pet não cencontrado.");
    }

    public void listarEspecies(){
        HashSet<String> especies = new HashSet<>();

        for (int i = 0; i <contador ; i++) {
            Pet pet = pets[i];
            especies.add(pet.getEspecie());
        }

        System.out.println("--- ESPÉCIES CADASTRADAS ---");
        for (String especie : especies) {
            System.out.println("- " + especie );
        }
        System.out.println("Total de espécies diferentes: " + especies.size());
    }

    public void entrarFilaBanho(Scanner sc){

        System.out.print("Digite o nome do pet para entrar na fila: ");
        String nomePet = sc.nextLine();

        filaPets.offer(nomePet);

        System.out.println(nomePet + " entrou na fila.");
        System.out.println("Fila agora: " + filaPets);
    }

    public void atenderProximoPet(){

        if (filaPets.isEmpty()){
            System.out.println("Fila de pets vazia!");
            return;
        }

        System.out.println("Próximo da fila: " + filaPets.peek());

        String nomePet = filaPets.poll();

        System.out.println("Atendendo " + nomePet + "...");
        System.out.println("Fila agora: " + filaPets);
    }

    public void executarServicos(Scanner sc) {

        System.out.print("Nome do pet: ");
        String nomePet = sc.nextLine();

        ArrayList<Servico> lista = new ArrayList<>();

        lista.add(new Banho());
        lista.add(new Tosa());
        lista.add(new Consulta());

        for (Servico servico : lista) {
            servico.executar(nomePet);
        }
    }
}
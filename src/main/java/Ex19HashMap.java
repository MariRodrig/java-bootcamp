import java.util.HashMap;

public class Ex19HashMap {
    public static void main(String[] args) {

        // Crie um HashMap de nomes e idades com três pessoas.
        // Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.

        HashMap<String, Integer> idades = new HashMap<>();

        idades.put("Alfredo", 8);
        idades.put("Malone", 3);
        idades.put("Lebron", 5);

        System.out.println("Idades cadastradas: " + idades);

        System.out.println("Idade de Malone: " + idades.get("Malone"));

        System.out.println("----------");

        // Crie um HashMap de produtos e preços.
        // Coloque "café" com valor 5.00, imprima e depois faça put de "café" DE NOVO com valor 7.50.
        // Imprima outra vez e veja o que aconteceu com o tamanho.

        HashMap<String, Double> precos = new HashMap<>();

        precos.put("café", 5.50);
        precos.put("leite", 4.00);
        precos.put("arroz", 15.00);

        System.out.println("Preços cadastrados: " + precos);
        System.out.println("Quantidade de produtos: " + precos.size());

        precos.put("café", 7.50);
        System.out.println("Preços atualizados: " + precos);
        System.out.println("Quantidade de produtos após atualização: " + precos.size());

        System.out.println("----------");

        // Crie uma agenda (nome -> telefone) com duas pessoas.
        // Use containsKey dentro de um if para mostrar o telefone de alguém que está na agenda e de alguém que não está.

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Lucas Ribeiro", "98855-3636");
        agenda.put("Leonardo Ribeiro", "98855-1010");

        if (agenda.containsKey("Lucas Ribeiro")) {
            System.out.println("Telefone de Lucas Ribeiro: " + agenda.get("Lucas Ribeiro"));
        } else {
            System.out.println("Lucas Ribeiro não está na agenda.");
        }
        if (agenda.containsKey("Mariana")) {
            System.out.println("Telefone de Mariana: " + agenda.get("Mariana"));
        } else {
            System.out.println("Mariana não está na agenda.");
        }

        System.out.println("----------");

        // Crie um HashMap de estoque (produto -> quantidade) com dois itens.
        // Use getOrDefault para mostrar a quantidade de um produto que existe e de um que não existe (devolvendo 0).
        // Depois tente com get normal no que não existe e compare.

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Mouse", 8);
        estoque.put("Monitor", 15);

        int produto1 = estoque.getOrDefault("Mouse", 0);
        System.out.println("Quantidade de Mouse: " + produto1);

        int produto2 = estoque.getOrDefault("Fone", 0);
        System.out.println("Quantidade de Fone: " + produto2);

        Integer produto3 = estoque.get("Fone");
        System.out.println("Buscando Fone com get(): " + produto3);

        System.out.println("----------");

        // Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
        // Remova uma delas e imprima de novo.

        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Cecilia", 10);
        notas.put("Rodolfo", 4);
        notas.put("Romulo", 9);

        System.out.println("Notas dos alunos: " + notas);
        System.out.println("Quantidade de alunos: " + notas.size());

        notas.remove("Rodolfo");
        System.out.println("Notas dos alunos atualizadas: " +notas);
        System.out.println("Quantidade de alunos após remoção: " + notas.size());
    }
}

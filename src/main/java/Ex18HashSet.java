import java.util.ArrayList;
import java.util.HashSet;

public class Ex18HashSet {
    public static void main(String[] args) {

        // Crie um HashSet de nomes e adicione quatro valores, sendo um deles repetido.
        // Imprima o conjunto e o tamanho. Repare no que aconteceu com o repetido.

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Ava");
        nomes.add("Clair");
        nomes.add("Ava");
        nomes.add("Aaron");

        System.out.println(nomes);
        System.out.println(nomes.size());

        System.out.println("-----------");

        // Crie um HashSet de cores usando addAll. Depois use contains dentro de um if
        // para avisar se a cor "verde" já está no conjunto ou não.

        ArrayList<String> listaCores = new ArrayList<>();
        listaCores.add("Azul");
        listaCores.add("Verde");
        listaCores.add("Preto");
        listaCores.add("Branco");

        HashSet<String> cores = new HashSet<>();
        cores.addAll(listaCores);

        System.out.println(cores);

        if (cores.contains("Verde")) {
            System.out.println("A cor está no conjunto de cores.");
        } else {
            System.out.println("A cor não está no conjunto de cores.");
        }

        System.out.println("-----------");

        // Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para tirar os repetidos.
        // Imprima os dois e compare.

        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Aurora");
        listaNomes.add("Charles");
        listaNomes.add("Cecilia");
        listaNomes.add("Aurora");

        System.out.println(listaNomes);

        HashSet<String> lista = new HashSet<>();
        lista.addAll(listaNomes);
        System.out.println(lista);

        System.out.println("-----------");

        // Crie um HashSet com três CPFs e imprima. Depois remova um deles e imprima de novo, junto com o tamanho.

        HashSet<String> cpfs = new HashSet<>();

        cpfs.add("155.999.666-86");
        cpfs.add("200.999.666-90");
        cpfs.add("045.999.666-10");

        System.out.println("Lista inicial de cpfs: " + cpfs);

        cpfs.remove("045.999.666-10");
        System.out.println("Lista atualizada de cpfs: " + cpfs);
        System.out.println("O tamanho da lista é de" + cpfs.size() + " cpfs.");

        System.out.println("-----------");

        // Crie um HashSet com três frutas e percorra ele com for, imprimindo uma por linha.

        HashSet<String> frutas = new HashSet<>();
        frutas.add("Mamão");
        frutas.add("Melão");
        frutas.add("Banana");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        System.out.println("-----------");

        // Crie um HashSet vazio. Imprima o isEmpty().
        // Adicione um valor e imprima o isEmpty() de novo.

        HashSet<String> vazio = new HashSet<>();
        System.out.println("O conjunto está vazio? " + vazio.isEmpty());

        vazio.add("Teste");
        System.out.println("O conjunto está vazio após adicionar um valor? " + vazio.isEmpty());
    }
}

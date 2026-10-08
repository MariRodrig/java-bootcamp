package ex17list;

// Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

import java.util.ArrayList;
import java.util.List;

public class Ex01ListaDeNomes {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(List.of("Lucas", "Fernanda", "Vinicius"));

        System.out.println(list);
    }
}

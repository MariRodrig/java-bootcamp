package ex17list;

// Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)

import java.util.ArrayList;
import java.util.List;

public class Ex05PercorrerListaDeNomes {
    public static void main(String[] args) {

        List<String> listName = new ArrayList<>();
        listName.addAll(List.of("Charles", "Valentin", "Ava", "Aaron", "Rodrigo", "Pedro"));

        for (int i = 0; i < listName.size(); i++) {
            System.out.println(i + ": " + listName.get(i));
        }

    }
}


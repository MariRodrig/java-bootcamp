package Ex17List;

// Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

import java.util.ArrayList;
import java.util.List;

public class Ex03AlterarNomeNaLista {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of( "Alfredo", "Romulo", "Cecilia"));
        System.out.println("Lista inicial: " + list);

        list.set(2, "Briana");
        System.out.println("Lista atualizada: " + list);
    }
}

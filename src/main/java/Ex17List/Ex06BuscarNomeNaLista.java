package Ex17List;

// Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06BuscarNomeNaLista {
    public static void main(String[] args) {

        List<String> listName = new ArrayList<>();

        listName.addAll(List.of("Charles", "Briana", "Ava", "Tom"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String name = sc.nextLine();

      if (listName.contains(name)){
          System.out.println("O nome " + name + " está na lista, na posição " + listName.indexOf(name) + ".");
      } else {
          System.out.println("O nome " + name + " não está na lista.");
      }
    }
}

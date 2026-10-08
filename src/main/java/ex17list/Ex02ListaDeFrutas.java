package ex17list;

// Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

import java.util.ArrayList;
import java.util.List;

public class Ex02ListaDeFrutas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Melão", "Goiaba", "Kiwi", "Jabuticaba"));

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        System.out.println(list.size());
    }
}

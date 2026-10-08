package ex17list;

// Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

import java.util.ArrayList;
import java.util.List;

public class Ex04RemoverCidadeDaLista {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("Juiz de Fora", "São Paulo", "Rio de Janeiro", "Belo Horizonte"));
        System.out.println("Lista inicial: " + list);

        list.remove(1);
        System.out.println("Lista após a remoção do index posição 1: " + list);
    }
}

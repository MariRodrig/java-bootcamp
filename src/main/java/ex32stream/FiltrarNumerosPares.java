package ex32stream;

import java.util.List;

// Crie uma lista de números de 1 a 6.
// Utilize stream() e filter() para selecionar apenas os números pares,
// armazene o resultado em uma nova lista com toList() e imprima os valores.

public class FiltrarNumerosPares {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> resultado = numeros.stream()
                .filter(numero -> numero % 2 ==0)
                .toList();

        System.out.println("Números pares: " + resultado);

    }
}

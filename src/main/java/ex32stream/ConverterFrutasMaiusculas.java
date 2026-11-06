package ex32stream;

import java.util.List;

// Crie uma lista de frutas em letras minúsculas. Utilize stream()
// e map() para transformar os nomes em letras maiúsculas e forEach() para imprimir cada fruta na tela.

public class ConverterFrutasMaiusculas {
    public static void main(String[] args) {

        List<String> frutas = List.of("Maca", "Laranja", "Mamão", "Abacaxi", "Melão");

        frutas.stream()
                .map(fruta -> fruta.toUpperCase())
                .forEach(System.out::println);
    }
}

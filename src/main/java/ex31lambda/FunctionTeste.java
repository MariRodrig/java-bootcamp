package ex31lambda;

import java.util.function.Function;

// Crie duas Function usando lambdas: uma para transformar um número em texto de nota fiscal e outra para contar os caracteres de uma String com .length().
// Execute ambas com .apply() e imprima os resultados.

public class FunctionTeste {
    public static void main(String[] args) {

        Function<Integer, String> numeroNota =(numero) -> "A nota atualizada é: " + numero;
        String notaCompleta = numeroNota.apply(1542);
        System.out.println(notaCompleta);

        System.out.println("--------");

        Function<String, Integer> palavra = (nome) -> nome.length();
        System.out.println(palavra.apply("Professor"));
    }
}

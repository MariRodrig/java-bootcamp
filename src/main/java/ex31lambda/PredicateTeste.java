package ex31lambda;

import java.util.function.Predicate;

// Crie dois Predicate usando lambdas: um para verificar se um número é maior que 10 e outro para verificar se uma String está vazia.
// Teste ambos com .test() e imprima os resultados.

public class PredicateTeste {
    public static void main(String[] args) {

        Predicate<Integer> ehMaiorQueDez = (numero) -> numero > 10;

        System.out.println("O número 8 é maior que 10? " + ehMaiorQueDez.test(8));
        System.out.println("O número 15 é maior que 10? " + ehMaiorQueDez.test(15));

        System.out.println("--------");

        Predicate<String> textoVazio = (texto) -> texto.isEmpty();
        System.out.println(textoVazio.test(""));
        System.out.println(textoVazio.test("Dog"));

    }
}

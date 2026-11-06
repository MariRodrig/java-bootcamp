package ex31lambda;

import java.util.Random;
import java.util.function.Supplier;

// Crie dois Supplier usando lambdas: um que retorne uma mensagem (String) e outro que gere números aleatórios (Integer).
// Execute ambos com .get(), chamando o segundo duas vezes.

public class SupplierTeste {
    public static void main(String[] args) {

        Supplier<String> aviso = () -> "Aviso: O sistema está online!";
        System.out.println(aviso.get());

        System.out.println("-----------");

        Supplier<Integer> numAleatorio = () -> new Random().nextInt(100);
        System.out.println("Primeiro número aleatório: " + numAleatorio.get());
        System.out.println("Segundo número aleatório: " + numAleatorio.get());
    }
}

package ex31lambda;

import java.util.function.Consumer;

// Crie dois Consumer<String> usando lambdas: um para imprimir uma saudação e outro para imprimir o nome em maiúsculas.
// Execute com .accept() e utilize .andThen() para encadear as duas ações.

public class ConsumerTeste {
    public static void main(String[] args) {

        Consumer<String> saudacao = (nome) -> System.out.println("Olá " + nome);
        Consumer<String> saudacaoMaiusculo = (nome) -> System.out.println("Olá " + nome.toUpperCase());

//        saudacao.accept("Mari");
//        saudacaoMaiusculo.accept("Mari");

        // Encadeando as duas ações usando o andThen()
        saudacao.andThen(saudacaoMaiusculo).accept("Mari");

    }
}

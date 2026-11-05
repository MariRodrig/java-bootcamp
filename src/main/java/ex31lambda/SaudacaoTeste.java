package ex31lambda;

//  Crie uma interface funcional Saudacao com o metodo void executar().
//  Na classe principal, utilize uma expressão lambda para implementar o metodo, imprimindo a mensagem "oi" no console.

public class SaudacaoTeste{
    public static void main(String[] args) {

        Saudacao saudacao = () -> System.out.println("Oi");
        saudacao.executar();

    }
}



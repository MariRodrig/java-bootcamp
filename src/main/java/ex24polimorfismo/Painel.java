package ex24polimorfismo;

public class Painel {

    // Crie a classe Painel com QUATRO métodos chamados exibir,
    // cada um recebendo um tipo diferente: String, int, boolean e double.
    // Cada um imprime de um jeito, dizendo que tipo recebeu.
    // Chame os quatro.

    void exibir(String texto){
        System.out.println("Texto recebido: " + texto);
    }

    void exibir(int numero){
        System.out.println("Número inteiro recebido: " + numero);
    }

    void exibir(boolean valor){
        System.out.println("Valor booleano recebido: " + valor);
    }

    void exibir(double decimal){
        System.out.println("Número decimal recebido: " + decimal);
    }

}

package ex24polimorfismo;

public class Calculadora {

    //  Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
    //  - recebe um double (lado do quadrado)  -> lado * lado
    //  - recebe dois double (base e altura)   -> base * altura
    //  - recebe um int (raio do círculo)      -> 3.14159 * raio * raio
    //   Chame os três na Main e imprima os resultados.


    // Calcula a área do quadrado
    double calcularArea(double lado) {
        return lado * lado;
    }

    // Calcula a área do retângulo
    double calcularArea(double base, double altura) {
        return base * altura;
    }

    // Calcula a área do círculo
    double calcularArea(int raio) {
        return 3.14159 * raio * raio;
    }
}


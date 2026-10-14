package ex24polimorfismo;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.printf("Área do quadrado: %.2f%n", calculadora.calcularArea(5.0));

        System.out.printf("Área do retângulo: %.2f%n", calculadora.calcularArea(5.0, 10.0));

        System.out.printf("Área do círculo: %.2f%n", calculadora.calcularArea(3));
    }
}

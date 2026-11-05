package ex31lambda;

// Crie uma interface funcional Calculo com o metodo int calcular(int a, int b).
// Na classe principal, implemente três expressões lambda para realizar soma, multiplicação e retornar o maior entre dois números.
// Execute as três operações e imprima os resultados no console.

public class CalculoTeste {
    public static void main(String[] args) {

        Calculo soma = (a,b) -> a + b;
        Calculo multiplica = (a, b) -> a * b;
        Calculo maiorQue = (a, b) -> Math.max(a, b);

        System.out.println("Soma: " + soma.calcular(10,5));
        System.out.println("Multiplica: " +multiplica.calcular(10,5));
        System.out.println("Maior que: " +maiorQue.calcular(10,5));

    }
}

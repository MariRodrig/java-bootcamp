package revisaoFundamentos;

public class Operadores {
    public static void main(String[] args) {

        // Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.

        double a = 15;
        double b = 4;

        double soma = a + b;
        double sub = a - b;
        double multi = a * b;
        double div = a / b;
        double resto = a % b;


        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicação é: " + multi);
        System.out.println("A divisão é: " + div);
        System.out.println("O resto é: " + resto);

        System.out.println("-----------");

        // Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.

        int saldo = 1000;
        saldo += 250;
        saldo -= 350;
        System.out.println("O saldo final é " + saldo);

        System.out.println("-----------");

        // Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.

        int valorA = 10;
        int valorB = 10;

        boolean iguais = valorA == valorB;
        boolean diferentes = valorA != valorB;
        boolean maiorQue = valorA > valorB;
        boolean maiorOuIgual = valorA >= valorB;

        System.out.println("Os valores são iguais? " + iguais);
        System.out.println("Os valores são diferentes? " + diferentes);
        System.out.println("A é maior que B? " + maiorQue);
        System.out.println("A é maior ou igual a B? " + maiorOuIgual);

        System.out.println("-----------");

        // Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.

        int idade = 20;
        boolean temCarteira = true;

        if (idade >= 18 && temCarteira){
            System.out.println("Apto para dirigir!");
        } else{
            System.out.println("Não está apto para dirigir!");
        }

        System.out.println("-----------");

        // Crie um número e imprima o resto da divisão dele por 2.

        int num = 23;
        int valorResto = num % 2;

        System.out.println(valorResto);

        System.out.println("-----------");

        // Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.

        double precoArroz = 5.50;
        double totalCompra = precoArroz * 3;
        System.out.printf("O valor total da compra foi de %.2f.%n", totalCompra);

        System.out.println("-----------");

        // Mini-desafio — Crie uma variável com um número qualquer e, sem usar if,
        // imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?

        int numero = 17;
        boolean divisivelPor3E5  = numero % 3 == 0 && numero % 5 == 0;

        System.out.println("Esse número é divisível por 3 e por 5 ao mesmo tempo? " + divisivelPor3E5);
    }
}

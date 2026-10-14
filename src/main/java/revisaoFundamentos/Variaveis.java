package revisaoFundamentos;

public class Variaveis {
    public static void main(String[] args) {

        // Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.

        String name = "Briana";
        int age = 30;
        double height = 1.60;
        boolean isProgrammer = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(isProgrammer);

        System.out.println("-----------");

        // Crie uma variável cidade e imprima: "Eu moro em Salvador."

        String city = "Salvador";
        System.out.println("Eu moro em " + city + ".");

        System.out.println("-----------");

        // Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.

        String primeiroNome = "Alfredo";
        String sobrenome = "Mesquita";

        System.out.println("Meu nome é " + primeiroNome + " " + sobrenome + ".");

        System.out.println("-----------");

        // Crie uma variável preco com 29.90 e imprima o valor dela numa frase.

        double preco = 29.90;
        System.out.printf("O valor da compra é %.2f.%n ", preco);

        System.out.println("-----------");

        // Crie uma variável temCarteira com true e imprima.

        boolean temCarteira = true;
        System.out.println(temCarteira);

        System.out.println("-----------");

        // Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.

        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("O valor de a é: " + a + " e o valor de b é: " + b);
    }
}






public class Ex02ConcatenacaoEOperadoresAritmeticos {
    public static void main(String[] args) {

        //  01. Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."

        String nome = "Alfredo";
        int idade = 9;
        String cidade = "Sao Paulo";

        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos.");


        //  02. Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0."

        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        double total = preco * quantidade;
        System.out.println("-------------");
        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + total);


        //  03. Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."

        int num1 = 15;
        int num2 = 4;
        int result = num1 + num2;
        System.out.println("-------------");
        System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + result + ".");

        // Aritméticos:
        System.out.println("-------------");
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        // O primeiro como a expressão começa com uma String, concatena os valores 2 + 2 resultando em 22
        // O segundo por ter o parêntese, ele faz a soma primeiro, e depois concatena o resultado


        // Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        int a = 10;
        int b = 3;

        int soma = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int resto = a % b;

        System.out.println("-------------");
        System.out.println("Soma: " + soma + ", Subtração: " + sub + ", Multiplicação: " + multi + ", Divisão: " + div + ", Resto: " + resto);

        // Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.

        double a1 = 10;
        double b1 = 3;

        double soma1 = a1 + b1;
        double sub1 = a1 - b1;
        double multi1 = a1 * b1;
        double div1 = a1 / b1;
        double resto1 = a1 % b1;

        System.out.println("-------------");
        System.out.printf("Soma: %.1f, Subtração: %.1f, Multiplicação: %.1f, Divisão: %.2f, Resto: %.1f%n", soma1, sub1, multi1, div1, resto1);

        // Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;
        double soma2 = nota1 + nota2 + nota3;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("-------------");
        System.out.println("Soma: " + soma2 + " | Média: " + media);

        // Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.

        int a2 = 3;
        int b2 = 4;
        int c2 = 5;
        int resultado = a2 + (b2 * c2);

        System.out.println("-------------");
        System.out.println("O resultado é " + resultado);


        // Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.

        int a3 = 3;
        int b3 = 4;
        int c3 = 5;
        int resultado2 = (a3 + b3) * c3;

        System.out.println("-------------");
        System.out.println("O resultado é " + resultado2);


        // Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
        // Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.

        int totalSegundos = 3785;
        int minutosInteiros = totalSegundos / 60;
        int restoSegundos = totalSegundos % 60;

        System.out.println("-------------");
        System.out.println("O total de minutos inteiros é " + minutosInteiros + " minutos com resto " + restoSegundos);
    }
}

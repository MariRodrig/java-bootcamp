package revisaoFundamentos;

public class ConcatenacaoEPrintf {
    public static void main(String[] args) {

        // Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."

        String nome = "Charles";
        int idade = 9;

        System.out.println(nome + " tem " + idade + " anos.");

        System.out.println("-----------");

        // Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.

        double nota1 = 8.0;
        double nota2 = 7.0;

        double media = (nota1 + nota2) / 2;
        System.out.printf("A média é %.2f.%n", media);

        System.out.println("-----------");

        // Crie uma variável com o preço de um produto e imprima com duas casas decimais.

        double precoProduto = 5.50;
        System.out.printf("O preço do produto é %.2f.%n", precoProduto);

        System.out.println("-----------");

        // Usando printf, imprima numa linha só o nome, a idade e a altura.

        String name = "Briana";
        int age = 25;
        double height = 1.55;

        System.out.printf("Meu nome é %s, tenho %d anos e tenho %.2f de altura.%n", name, age, height);

        System.out.println("-----------");

        // Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo.
        // Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.

        String nome1 = "Teclado";
        double preco1 = 150.00;

        String nome2 = "Mouse";
        double preco2 = 80.50;

        String nome3 = "Monitor";
        double preco3 = 600.00;

        double total = preco1 + preco2 + preco3;

        System.out.printf("%s - R$ %.2f%n", nome1, preco1);
        System.out.printf("%s - R$ %.2f%n", nome2, preco2);
        System.out.printf("%s - R$ %.2f%n", nome3, preco3);

        System.out.printf("Total: R$ %.2f%n", total);

    }
}

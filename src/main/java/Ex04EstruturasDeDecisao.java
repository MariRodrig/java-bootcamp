

public class Ex04EstruturasDeDecisao {
    public static void main(String[] args) {

        // 1 — Crie uma variável idade e mostre a categoria de uma pessoa:
        // menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".

        int idade = 16;

        if (idade < 13) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso!");
        }

        System.out.println("-------------");

        // 2 - Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00).
        // Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante.
        // Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldo = 500.00;
        double valorCompra = 300.00;

        if (saldo >= valorCompra) {
            System.out.println("Compra aprovada! Saldo restante: R$ " + (saldo - valorCompra));
        } else {
            System.out.println("Saldo insuficiente! Faltam: R$ " + (valorCompra - saldo));
        }

        System.out.println("-------------");

        // 3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio:
        // 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".

        int pedido = 2;

        switch (pedido) {
            case 1 -> System.out.println("Café");
            case 2 -> System.out.println("Cappuccino");
            case 3 -> System.out.println("Chocolate quente");
            case 4 -> System.out.println("Chá");
            default -> System.out.println("Opção inválida!");
        }

        System.out.println("-------------");

        // 4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização.
        // Faça o mesmo para precisa ter 18 anos e ter autorização.

        int age = 15;
        boolean temAutorizacao = true;

        // Precisa ter 18 anos OU ter autorização
        if (age >= 18 || temAutorizacao) {
            System.out.println("Pode entrar na festa!");
        } else {
            System.out.println("Não pode entrar na festa!");
        }

        System.out.println("--------------------");

        // Precisa ter 18 anos E ter autorização
        if (age >= 18 && temAutorizacao) {
            System.out.println("Pode entrar na festa!");
        } else {
            System.out.println("Não pode entrar na festa!");
        }

        System.out.println("--------------------");

        // Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre:
        // "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5.
        // Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double mediaNotas = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das notas da aluna foi: %.2f%n", mediaNotas);

        if (mediaNotas >= 7) {
            System.out.println("Aluna aprovada!");
        } else if (mediaNotas >= 5 && mediaNotas <= 6.9){
            System.out.println("Aluna em recuperação!");
        } else {
            System.out.println("Aluna reprovada!");
        }
    }
}

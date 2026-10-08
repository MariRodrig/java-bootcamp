package ex15metodos;

import java.util.Scanner;

public class MetodosTeste {
    public static void main(String[] args) {

        // Crie um metodo saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.
        Metodos.saudar("Lucas");
        Metodos.saudar("Alfredo");
        Metodos.saudar("Cecilia");

        // Crie um metodo dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
        int resultado = Metodos.dobro(2);
        System.out.println(resultado);


        // Crie um metodo calcularMedia(double n1, double n2) que devolve a média das duas notas.
        //  No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        double media = Metodos.calcularMedia(n1, n2);
        System.out.printf("A media das notas é: %.2f%n", media);

        // Crie um metodo ehMaiorDeIdade(int idade) que devolve true ou false.
        // No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        if (Metodos.ehMaiorDeIdade(idade)) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Crie três métodos com o mesmo nome somar: um que recebe dois inteiros, um que recebe três inteiros e um que recebe dois decimais
        System.out.println("A soma dos três números é: " + Metodos.somar(3, 5, 2));
        System.out.println("A soma dos dois números é: " + Metodos.somar(1, 4));
        System.out.println("A soma dos dois números decimais é: " + Metodos.somar(10.5, 8.5));

        // Crie dois métodos chamados saudacao: um sem parâmetro, que imprime "Olá!"
        // um que recebe um nome, e imprime "Olá, [nome]!"
        Metodos.saudacao();
        Metodos.saudacao("Lara");
    }
}


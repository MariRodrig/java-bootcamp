package revisaofundamentos.metodos;

public class Metodos {
    public static void main(String[] args) {
        // Crie um metodo mostrarBoasVindas() que imprime uma mensagem. Chame no main.
        mostrarBoasVindas();

        // Crie saudacao(String nome) que imprime "Olá, [nome]!". Chame três vezes com nomes diferentes.
        saudacao("Diana");
        saudacao("Michelle");
        saudacao("Jennifer");

        // Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.
        System.out.println("Dobro do número: " + dobro(15));

        // Crie calcularMedia(double n1, double n2) que devolve a média. Mostre com duas casas decimais.
        double media = calcularMedia(15.0, 5.0);
        System.out.printf("Média: %.2f%n", media);

        // Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.
        if (ehPar(8)) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Crie dois métodos somar: um que recebe dois números e outro que recebe três.
        System.out.println("Soma de dois números: " + somar(10, 20));
        System.out.println("Soma de três números: " + somar(10, 20, 30));

        // Mini-desafio — Crie um metodo ehMaiorDeIdade(int idade) que devolve true ou false.
        // Depois crie outro metodo, liberarEntrada(int idade), que chama o primeiro e imprime se a pessoa pode entrar ou não.
        liberarEntrada(20);

        System.out.println("---------");
    }

    static void mostrarBoasVindas() {
        System.out.println("Seja bem-vindo!");
    }

    static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    static int dobro(int num) {
        return num * 2;
    }

    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    static int somar(int num1, int num2) {
        return num1 + num2;
    }

    static int somar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    static void liberarEntrada(int idade) {
        if (ehMaiorDeIdade(idade)) {
            System.out.println("Entrada permitida!");
        } else {
            System.out.println("Entrada não permitida!");
        }
    }
}

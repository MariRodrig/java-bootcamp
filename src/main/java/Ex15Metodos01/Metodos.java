package Ex15Metodos01;

public class Metodos {

    static void saudar(String nome) {
        System.out.println("Olá, " + nome + "! Tudo bem?");
    }


    static int dobro(int numero) {
        return numero * 2;
    }

    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    static int somar(int num1, int num2) {
        return num1 + num2;
    }

    static int somar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static double somar(double num1, double num2) {
        return num1 + num2;
    }

    static void saudacao() {
        System.out.println("Olá!");
    }

    static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }
}

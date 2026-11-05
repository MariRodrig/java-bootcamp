package ex31lambda;

// Crie uma interface Condicao com boolean testar(int n) e um metodo estático executarSe() que executa uma ação se a condição for verdadeira.
// No main, passe lambdas diretamente para verificar se os números 4 e 7 são pares e imprimir "É par!" quando verdadeiro.


public class CondicaoTeste {
    public static void main(String[] args) {

        Condicao.executarSe(n -> n % 2 == 0, 4,
                () -> System.out.println("É par"));

        Condicao.executarSe(n -> n % 2 == 0, 7,
                () -> System.out.println("É par"));
    }
}

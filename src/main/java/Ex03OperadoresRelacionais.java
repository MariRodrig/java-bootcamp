
public class Ex03OperadoresRelacionais {
    public static void main(String[] args) {

        // 1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
        //- a = 5, b = 5

        // Caso 1: a = 10, b = 3
        int notaMaria = 10;
        int notaJoana = 3;

        System.out.println("Caso 1: Maria = 10 | Joana = 3");

        if (notaMaria > notaJoana) {
            System.out.println("A nota da Maria é maior que a nota da Joana!");
        } else if (notaMaria < notaJoana) {
            System.out.println("A nota da Maria é menor que a nota da Joana!");
        } else {
            System.out.println("As notas são iguais!");
        }

        System.out.println("-------------");

        // Caso 2: a = 3, b = 10
        int notaAna = 3;
        int notaRafa = 10;

        System.out.println("Caso 2: Ana = 3 | Rafa = 10");
        if (notaAna > notaRafa) {
            System.out.println("A nota da Ana é maior que a nota da Rafa!");
        } else if (notaAna < notaRafa) {
            System.out.println("A nota da Ana é menor que a nota da Rafa!");
        } else {
            System.out.println("As notas são iguais!");

        }

        System.out.println("-------------");
        // Caso 3: a=5, b = 5
        int notaJoao = 5;
        int notaLucas = 5;

        System.out.println("Caso 3: João = 5 | Lucas = 5");
        if (notaJoao > notaLucas){
            System.out.println("A nota do João é maior que a nota do Lucas!");
        } else if ( notaJoao < notaLucas) {
            System.out.println("A nodta do João é menor que a nota do Lucas!");
        } else {
            System.out.println("As notas são iguais!");
        }

        System.out.println("-------------");

        // Exiba na tela  a == b, sendo a = 10 e b 3.

        int a = 10;
        int b = 3;

        if ( a == 3){
            System.out.println("Os valores são iguais!");
        }else {
            System.out.println("Os valores são diferentes!");
        }

        System.out.println(a == b);

        System.out.println("-------------");

        // Dado boolean chovendo = true, retorne na tela o resultado de !chovendo

        boolean chovendo =  true;

        System.out.println(!chovendo);
    }
}


import java.util.ArrayList;

public class Ex21ForEach {
    public static void main(String[] args) {

        //  Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each, um por linha.

        String[] nomes = {"Ana", "Lara", "Vinicius", "Lucas"};

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("---------");

        // Crie um ArrayList com 5 notas e imprima todas usando for-each.

        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(7);
        notas.add(8);
        notas.add(6);
        notas.add(9);
        notas.add(10);

        for (int nota : notas) {
            System.out.println("Nota: " + nota);
        }

        System.out.println("---------");

        //  Com o array de notas {8, 6, 10, 7}, use for-each para somar todas e mostrar a soma e a média.

        int[] notasAlunos = {8, 6, 10, 7};
        int soma = 0;

        for (int notasAluno : notasAlunos) {
            soma += notasAluno;
        }
        double media = (double) soma / notasAlunos.length;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);

        System.out.println("---------");

        // Com um array de nomes, use for-each e um if para contar quantos têm mais de 5 letras.
        // Mostre o total. Dica: usem o metodo length.

        String[] nomePessoas = {"Fabricio", "Bernardo", "Lion", "Ava"};

        int totalNomesLongos = 0;

        for (String nomePessoa : nomePessoas) {
            if (nomePessoa.length() > 5) {
                System.out.println(nomePessoa);
                totalNomesLongos++;
            }
        }
        System.out.println("Total de nomes com mais de 5 letras: " + totalNomesLongos);

        System.out.println("---------");

        // Pegue o exercício 1 e escreva ele DE NOVO com o for normal, usando o índice.
        // Deixe os dois na mesma classe e compare.

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
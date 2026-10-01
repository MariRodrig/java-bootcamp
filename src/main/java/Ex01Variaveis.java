public class Ex01Variaveis {
    public static void main(String[] args) {

        String nome = "Alfredo";
        int idade = 9;
        int anoNascimento = 2017;

        String cidade = "São Paulo";
        String cep = "22222-555";

        String telefone = "9999-8888";
        String profissao = "estudante";

        double altura = 10;
        double peso = 14;

        double temperatura = 30;
        double nota = 10;

        boolean ehFumante = false;
        boolean possuiCNH = false;

        System.out.println("Seus dados são:");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(anoNascimento);
        System.out.println(cidade);
        System.out.println(cep);
        System.out.println(telefone);
        System.out.println(profissao);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(temperatura);
        System.out.println(nota);
        System.out.println(ehFumante);
        System.out.println(possuiCNH);

        System.out.println("--------");
        System.out.println("Olá " + nome + " sua cidade é: " + cidade + ".");
    }
}

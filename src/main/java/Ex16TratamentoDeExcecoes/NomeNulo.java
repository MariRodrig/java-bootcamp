package Ex16TratamentoDeExcecoes;

public class NomeNulo {
    public static void main(String[] args) {

        // 4 — Crie uma variável String nome = null; e tente imprimir nome.length().
        // Trate a NullPointerException e mostre "O nome não foi preenchido."

        String nome = null;
        try {
            System.out.println(nome.length());
        } catch (java.lang.NullPointerException e){
            System.out.println("O nome não foi preenchido.");
        }
    }
}

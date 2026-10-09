package revisaofundamentos.tratamentoexcecoes;

public class NullPointerExceptionTeste {
    public static void main(String[] args) {

        // Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.

        String nome= null;

        try {
            System.out.println(nome.length());
        } catch (NullPointerException e){
            System.out.println("O nome não foi preenchido.");
        }

    }
}

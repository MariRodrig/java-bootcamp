package revisaopoo;

//  Crie um Retangulo, chame exibirNome() e imprima a área.

public class RetanguloTeste {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo("Retângulo", 5, 3);

        retangulo.exibirNome();

        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        //  Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê?
        // Não é possível criar esse objeto porque Forma é uma classe abstrata e, por isso, não pode ser instanciada diretamente.

    }
}

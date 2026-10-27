package ex29designpatterns.observer;

//  Criar uma interface com o metodo atualizar(int quantidade).
//  Implementar ObservadorEstoque e exibir a nova quantidade recebida.
//  Criar um estoque com uma lista de observadores.
//  Permitir cadastrar e notificar observadores ao alterar a quantidade.
//  Criar um estoque e cadastrar um observador.
//  Alterar a quantidade duas vezes e verificar as notificações.

public class ObservadorEstoqueTeste {
    public static void main(String[] args) {

        Estoque estoque = new Estoque("Produto", 10);
        RegistroEstoque registroEstoque = new RegistroEstoque();

        estoque.adicionarObservador(registroEstoque);

        estoque.setQuantidade(3);
        estoque.setQuantidade(8);

    }
}

package revisaopoo;

//  Crie uma classe abstrata Forma com: um atributo nome; um construtor que recebe o nome;
//  um metodo normal exibirNome(), que imprime o nome da forma;
//  um metodo abstrato calcularArea(), que retorna um double.

abstract class Forma {

    String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public void exibirNome(){
        System.out.println("Nome da forma: " + nome);
    }

   public abstract double calcularArea();
}

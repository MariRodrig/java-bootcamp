package ex22interfaces;

import java.util.ArrayList;

public class InterfacesAnimal {
    public static void main(String[] args) {

        // Acrescente a classe Gato, que implemente a mesma interface e imprima "Miau!".
        // Na main, declare as duas variáveis como Animal e chame emitirSom() nas duas.

        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();

        System.out.println("-------------");

        // Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro, e percorra com for-each chamando emitirSom().
        // Repare que não tem nenhum if.

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal: animais) {
          animal.emitirSom();
        }
    }
}

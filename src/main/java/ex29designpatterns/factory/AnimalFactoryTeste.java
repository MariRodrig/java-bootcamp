package ex29designpatterns.factory;

//  Crie a interface com o metodo emitirSom().
//  Implemente as classes Cachorro e Gato.
//  Crie uma AnimalFactory com o metodo getAnimal(String tipo), responsável por retornar o animal correspondente.
//  Na classe de teste, utilize a Factory para criar os animais e executar emitirSom(), sem instanciá-los diretamente.

public class AnimalFactoryTeste {
    public static void main(String[] args) {

        Animal animal = AnimalFactory.getAnimal("Gato");
        animal.emitirSom();

        Animal animal2 = AnimalFactory.getAnimal("Cachorro");
        animal2.emitirSom();

    }
}

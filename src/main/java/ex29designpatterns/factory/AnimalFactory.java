package ex29designpatterns.factory;

public class AnimalFactory {

    public static Animal getAnimal(String tipo) {
        return switch (tipo) {
            case "Cachorro" -> new Cachorro();
            case "Gato" -> new Gato();
            default -> throw new IllegalArgumentException("Tipo inválido: " + tipo);
        };
    }
}

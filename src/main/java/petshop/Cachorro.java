package petshop;

public class Cachorro extends Pet{

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz au au!");
    }
}

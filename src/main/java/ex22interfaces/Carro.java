package ex22interfaces;

public class Carro implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando!");
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado!");
    }
}

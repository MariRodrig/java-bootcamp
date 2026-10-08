package ex22Interfaces;

public class Moto implements Veiculo {

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando!");
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada!");
    }
}

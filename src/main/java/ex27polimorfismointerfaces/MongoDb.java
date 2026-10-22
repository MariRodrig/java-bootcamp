package ex27polimorfismointerfaces;

public class MongoDb implements BancoDeDados {

    private int numero = 2;

    @Override
    public String chamarBanco() {
        return "O banco conectado é o MongoDb.";
    }

    @Override
    public int getNumero() {
        return numero;
    }
}
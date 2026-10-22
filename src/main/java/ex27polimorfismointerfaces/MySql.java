package ex27polimorfismointerfaces;

public class MySql implements BancoDeDados {

    private int numero = 1;

    @Override
    public String chamarBanco() {
        return "O banco de dados é o MySql.";
    }

    @Override
    public int getNumero() {
        return numero;
    }
}

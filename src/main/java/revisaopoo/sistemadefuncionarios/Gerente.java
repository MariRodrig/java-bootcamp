package revisaopoo.sistemadefuncionarios;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.50;
    }
}

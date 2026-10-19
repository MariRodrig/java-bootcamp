package revisaopoo.sistemadefuncionarios;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
      return getSalarioBase() * 1.20;
    }
}

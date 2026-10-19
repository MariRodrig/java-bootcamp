package revisaopoo.sistemadefuncionarios;

public abstract class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salarioBase = salario;
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Salário não pode ser negativo.");
        }
    }

    public abstract double calcularSalario();
}
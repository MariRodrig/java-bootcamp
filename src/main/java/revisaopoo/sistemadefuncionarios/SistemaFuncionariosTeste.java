package revisaopoo.sistemadefuncionarios;

// Crie uma classe abstrata Funcionario com nome, salarioBase, construtor, getters, setter com
// validação e metodo abstrato calcularSalario().
// Crie Desenvolvedor (+20%) e Gerente (+50%).
// Em seguida crie a interface Notificador com implementações para e-mail e SMS.
// Crie FolhaPagamento para calcular o salário e notificar o funcionário.
// No main, crie os funcionários e realize os pagamentos utilizando e-mail e SMS.

public class SistemaFuncionariosTeste {
    public static void main(String[] args) {

        Funcionario dev = new Desenvolvedor("Mariana", 10000);
        Funcionario gerente = new Gerente("Larissa", 5000);

        FolhaPagamento folhaEmail = new FolhaPagamento(new NotificadorEmail());

        folhaEmail.pagar(dev);
        folhaEmail.pagar(gerente);

        FolhaPagamento folhaSms = new FolhaPagamento(new NotificadorSms());

        folhaSms.pagar(dev);
        folhaSms.pagar(gerente);
    }
}


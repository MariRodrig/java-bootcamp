package ex25encapsulamento;

// Crie na classe ContaBancaria os metodos públicos depositar() e sacar(), responsáveis por realizar operações no saldo.
// O metodo depositar() deve recusar valores menores ou iguais a zero. O metodo sacar() deve impedir saques sem saldo suficiente.
// Crie os métodos privados temSaldo(), que verifica se existe saldo suficiente, e registrarLog(), que registra as operações.
// Na Main, realize um depósito de 500, tente depositar -100, tente sacar 2000 e, por último, saque 200.
// Acrescente na classe ContaBancaria o atributo privado numeroConta, inicializado com o valor "001-X".
// Crie apenas o getter para permitir a consulta do número da conta, sem disponibilizar um setter.
// Na Main, exiba o número da conta e tente modificá-lo utilizando um metodo setNumeroConta().

public class ContaBancariaTeste {
    public static void main(String[] args) {

        ContaBancaria c = new ContaBancaria();

        c.setTitular("Ana");

        c.depositar(500);
        c.depositar(-100);
        c.sacar(2000);
        c.sacar(200);

        System.out.println(c.getNumeroConta());


    }
}

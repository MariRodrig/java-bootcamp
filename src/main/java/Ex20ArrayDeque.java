import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Ex20ArrayDeque {
    public static void main(String[] args) {

        //  Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.

        Deque<String> pessoas = new ArrayDeque<>();

        pessoas.add("Adolfo");
        pessoas.add("Jorge");
        pessoas.add("Luiz");

        System.out.println("Pessoas na fila: " + pessoas);
        System.out.println("Total de pessoas na fila: " + pessoas.size());

        System.out.println("---------");

        // Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        // imprima a fila logo depois. Repare que ela não mudou.

        Deque<String> filaFuncionarios = new ArrayDeque<>();

        filaFuncionarios.add("Marina");
        filaFuncionarios.add("Rafaela");
        filaFuncionarios.add("Tatiane");
        filaFuncionarios.add("Lara");

        List<String> funcionariosNovos = Arrays.asList("Caio", "Davi", "Eva");

        filaFuncionarios.addAll(funcionariosNovos);

        System.out.println("Fila de funcionários: " + filaFuncionarios);
        System.out.println("Próximo funcionário da fila: " + filaFuncionarios.peek());
        System.out.println("Fila após consultar o próximo: " +filaFuncionarios);

        System.out.println("---------");

        //  Mesma fila. Agora use poll para atender o primeiro e imprima a fila depois.
        //  Compare com o exercício 2.

        System.out.println("Funcionário atendido: " + filaFuncionarios.poll());
        System.out.println("Fila após o atendimento: " + filaFuncionarios);

        System.out.println("---------");

        // Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()).
        // No final, imprima "Fila vazia!".

        Deque<String> clientes = new ArrayDeque<>();

        clientes.add("Joseph");
        clientes.add("Ralph");
        clientes.add("Zyon");

        while (!clientes.isEmpty()){
            System.out.println("Cliente atendido: " + clientes.poll());
        }
        System.out.println("Fila vazia!");

        System.out.println("---------");

        // Crie uma fila com três nomes e use contains para responder duas perguntas: se "Bia" está na fila e se "Zoe" está.

        Deque<String> filaNomes  = new ArrayDeque<>();

        filaNomes.add("Bia");
        filaNomes.add("Ava");
        filaNomes.add("Sofia");

        System.out.println("Bia está na fila? " + filaNomes.contains( "Bia"));
        System.out.println("Zoe está na fila? " + filaNomes.contains("Zoe"));

        System.out.println("---------");

        // Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        // - se estiver vazia  -> "Não tem ninguém na fila."
        // - se tiver gente    -> "Próximo: [nome]"
        // Depois adicione uma pessoa e teste de novo.

        Deque<String> filaPessoas  = new ArrayDeque<>();

        if (filaPessoas.isEmpty()){
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + filaPessoas.peek());
        }

        filaPessoas.add("Lion");

        if (filaPessoas.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + filaPessoas.peek());
        }
    }
}

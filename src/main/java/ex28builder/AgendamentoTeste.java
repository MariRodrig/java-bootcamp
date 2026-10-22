package ex28builder;

// Crie uma classe com os atributos: nomePet, servico, horario, perfume, laco, hidratacao, observacao e desconto.
// Utilize @Builder para criar os objetos.
// Crie um metodo mostrar() para exibir os dados
// Crie três agendamentos:
// - Thor: banho às 14h, com perfume, laço, observação de alergia e 10% de desconto.
// - Luna: tosa às 10h, sem extras.
// - Mel: banho às 16h, apenas com hidratação.

public class AgendamentoTeste {
    public static void main(String[] args) {

        Agendamento agendamento1 = Agendamento.builder()
                .nomePet("Thor").servico("banho").horario("14h").perfume(true).laco(true)
                .hidratacao(false).observacao("alérgico a shampoo").desconto(0.10).build();
        
        Agendamento agendamento2 = Agendamento.builder()
                .nomePet("Luna").servico("tosa").horario("10h").build();

        Agendamento agendamento3 = Agendamento.builder()
                .nomePet("Mel").servico("banho").horario("16h").hidratacao(true).build();


        agendamento1.mostrar();
        System.out.println("---------");
        agendamento2.mostrar();
        System.out.println("---------");
        agendamento3.mostrar();
    }
}

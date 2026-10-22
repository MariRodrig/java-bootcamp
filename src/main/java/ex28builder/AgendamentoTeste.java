package ex28builder;

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

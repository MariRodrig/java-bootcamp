package ex28builder;

import lombok.Builder;

@Builder
public class Agendamento {

   public String nomePet;
   public String servico;
   public String horario;
   public boolean perfume;
   public boolean laco;
   public boolean hidratacao;
   public String observacao;
   public double desconto;

    public void mostrar() {
        System.out.println("Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.printf("Desconto: %.0f%%%n", desconto * 100);
    }
}

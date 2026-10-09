package ex23heranca;

public class HerancaFuncionarioTeste {
    public static void main(String[] args) {

        Diretora diretora = new Diretora();

        diretora.nome = "Sonia";

        diretora.baterPonto();
        diretora.aprovarFerias("Larissa");
        diretora.definirMeta("Aumentar as vendas em 20%");

        System.out.println("-------");

        // Crie um gerente, preencha o nome e chame os quatro métodos nele:
        // baterPonto(), aprovarFerias(), notificar() e exportar().

        Gerente gerente = new Gerente();

        gerente.nome = "Carlos";

        gerente.baterPonto();
        gerente.aprovarFerias("Larissa");
        gerente.notificar("Reunião às 14h.");
        gerente.exportar();
    }
}

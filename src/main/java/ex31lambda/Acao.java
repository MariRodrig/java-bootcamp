package ex31lambda;

@FunctionalInterface
public interface Acao {

    void executar();


    static void repetirAcao(Acao acao) {

        acao.executar();
        acao.executar();
    }
}
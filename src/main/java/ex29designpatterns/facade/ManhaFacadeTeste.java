package ex29designpatterns.facade;

// Utilize as classes Despertador, Cafeteira e Chuveiro.
// Crie a classe ManhaFacade com o metodo acordar().
// No metodo acordar(), execute as três operações na ordem definida.
// No main, utilize apenas a Facade para executar a rotina.

public class ManhaFacadeTeste {
    public static void main(String[] args) {

        ManhaFacade manhaFacade = new ManhaFacade();
        manhaFacade.acordar();
    }
}

package ex31lambda;

public interface Operacao {

    int aplicar(int n);


    static void mostrarResultado(Operacao op, int valor){
        System.out.println(op.aplicar(valor));
    }
}

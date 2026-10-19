package ex26singleton;

// Crie uma classe Singleton chamada ContadorVisitas que: - tenha um atributo total, começando em 0;
// -tenha um metodo registrarVisita() que soma 1 ao total; -tenha um metodo getTotal() que devolve o total
// Depois, obtenha ele duas vezes em variáveis diferentes, registre visitas usando as duas, e imprima o total.
// O resultado deve mostrar que as duas variáveis usam o mesmo contador.

public class ContadorVisitasTeste {
    public static void main(String[] args) {

        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        pagina1.registrarVisita();
        pagina2.registrarVisita();

        System.out.println("Total de visitas: " + pagina1.getTotal());
    }
}

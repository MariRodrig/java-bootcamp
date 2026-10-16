package petshop;

public class Banho implements Servico{

    @Override
    public void executar(String nomePet){
        System.out.print("Nome do pet: " + nomePet + "..." );
    }
}

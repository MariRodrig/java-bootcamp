package ex27polimorfismointerfaces;

//  Crie uma interface BancoDeDados com os métodos: chamarBanco() e getNumero().
//  Crie as classes MySql e MongoDb, que implementam a interface e possuem um atributo int numero.
//  Na classe BancoDeDadosTeste, crie o metodo conectarBanco() para receber um BancoDeDados e exibir a mensagem do banco conectado.

public class BancoDeDadosTeste {
    public static void main(String[] args) {

        BancoDeDados mysql = new MySql();
        BancoDeDados mongoDb = new MongoDb();

        conectarBanco(mysql);
        conectarBanco(mongoDb);
    }

    public static void conectarBanco(BancoDeDados banco){
        System.out.println(banco.chamarBanco());

    }
}

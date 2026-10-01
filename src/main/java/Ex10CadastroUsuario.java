
import java.util.Scanner;

//  Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
//  Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
//  Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
//  Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."


public class Ex10CadastroUsuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.printf("O usuário %s nasceu em %d.", nomeCompleto, anoNascimento);
    }
}

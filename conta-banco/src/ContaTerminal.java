import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        //TO DO: 
            //Conhecer e importar a classe scanner

            //Exibir as mensagens para o nosso usuário

            //Obter pela scanner os valores digitados no terminal

            //Exibir a mensagem da conta criada


    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite a sua Cota do banco: ");
    int numeroConta = scanner.nextInt();
    
    System.out.println("Digite a sua agência: ");
    String agenciaConta = scanner.next();

    System.out.println("Digite o seu nome completo: ");
    String nomeCliente = scanner.next();

    System.out.println("Informe o saldo da sua conta: ");
    float saldoConta = scanner.nextFloat();


    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");

    }

}

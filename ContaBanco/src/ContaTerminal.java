import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0;

       System.out.println("*********Bem vindo ao BancoJava***********");
       System.out.println("Digite os dados da conta para a criação da conta...");
       System.out.println("***********************");
       System.out.print("Digite seu Nome: ");
       nomeCliente = scanner.next();
       System.out.println("*******************************");
       System.out.print("Digite o numero da Agencia: ");
       agencia = scanner.next();
       System.out.println("*******************************");
       System.out.print("Digite o numero da Conta...");
       numeroConta = scanner.nextInt();
       System.out.println("*******************************");
       System.out.print("Digite o valor do primeiro depósito R$: ");
       saldo = scanner.nextDouble();
       System.out.println("*******************************");


       System.out.println("Óla ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(" e seu saldo é de R$: ").concat(Double.toString(saldo)).concat(" e o valor já está disponível para saque."));







      

       
       
       
    }
}

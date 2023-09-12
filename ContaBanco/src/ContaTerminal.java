import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Conta terminal----");
        
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o seu nome: ");
        String nomeCliente =  scanner.next();
        nomeCliente += scanner.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}

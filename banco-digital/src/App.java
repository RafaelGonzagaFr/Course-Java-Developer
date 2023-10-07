import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name;
        String cpf;
        int tipoDeConta;
        int opc;
        Double dinheiro;
        int tempo;
        do {
            System.out.println("Criar a conta");
            System.out.println("Nome do cliente: ");
            name = scanner.next();
            System.out.println("CPF do cliente: ");
            cpf = scanner.next();
            System.out.println("Tipo de conta (Conta Poupança - 1)/(Conta Corrente - 2): ");
            tipoDeConta = scanner.nextInt();

            Cliente cliente = new Cliente();
            cliente.setName(name);
            cliente.setCpf(cpf);
            if(tipoDeConta == 1) {
                cliente.setTipoDeConta("Conta Poupança");
            } else if (tipoDeConta == 2) {
                cliente.setTipoDeConta("Conta Corrente");
            }

            if (tipoDeConta == 1) {
                ContaPoupanca contaPoupanca = new ContaPoupanca();
                contaPoupanca.setConta("111111");
                contaPoupanca.setAgencia(("2222222"));
                contaPoupanca.setPortadorDaConta(cliente.getName());


                do {
                    System.out.println("\n\n\n");
                    menuCP();
                    opc = scanner.nextInt();
                    if(opc == 1) {
                        System.out.println("Valor do depósito: ");
                        dinheiro = scanner.nextDouble();
                        contaPoupanca.depositar(dinheiro);
                    } else if (opc == 2) {
                        System.out.println("Valor do saque: ");
                        dinheiro = scanner.nextDouble();
                        contaPoupanca.sacar(dinheiro);
                    } else if (opc == 3) {
                        System.out.println("Saldo: R$"+contaPoupanca.getSaldo());
                    } else if (opc == 4) {
                        System.out.println("Valor a poupar: ");
                        dinheiro = scanner.nextDouble();

                        System.out.println("Tempo em meses: ");
                        tempo = scanner.nextInt();
                        contaPoupanca.poupar(tempo, dinheiro);
                    }
                } while (opc > 0 && opc < 5);
            } else if (tipoDeConta == 2) {
                ContaCorrente contaCorrente = new ContaCorrente();
                contaCorrente.setConta("11111111");
                contaCorrente.setAgencia("222222222");
                contaCorrente.setPortadorDaConta(cliente.getName());

                do {
                    System.out.println("\n\n\n");
                    menuCC();
                    opc = scanner.nextInt();
                    if(opc == 1) {
                        System.out.println("Valor do depósito: ");
                        dinheiro = scanner.nextDouble();
                        contaCorrente.depositar(dinheiro);
                    } else if (opc == 2) {
                        System.out.println("Valor do saque: ");
                        dinheiro = scanner.nextDouble();
                        contaCorrente.sacar(dinheiro);
                    } else if (opc == 3) {
                        System.out.println("Saldo: R$"+contaCorrente.getSaldo());
                    } 
                } while (opc > 0 && opc < 4);
            }

        
            System.out.println("Você saiu do banco, quer criar outro cliente ou sair do sistema? (1 - Outro/Outro - Sair)");
            opc = scanner.nextInt();
        } while(opc == 1);
        scanner.close();
    }

    public static void menuCC() {
        System.out.println("------banco------");
        System.out.println("1 - Realizar deposito");
        System.out.println("2 - Realizar saque");
        System.out.println("3 - Ver saldo");
        System.out.println(" Outro - Encerra");
    }

    public static void menuCP() {
        System.out.println("------banco------");
        System.out.println("1 - Realizar deposito");
        System.out.println("2 - Realizar saque");
        System.out.println("3 - Ver saldo");
        System.out.println("4 - Poupar");
        System.out.println(" Outro - Encerra");
    }
}



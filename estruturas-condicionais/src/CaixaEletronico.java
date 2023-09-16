public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 20;
        double valorSolicitado = 15.6;

        if (saldo >= valorSolicitado) {
            System.out.println("Valor liberado");
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo indisponível");
        }

        System.out.println(saldo);
    }
}

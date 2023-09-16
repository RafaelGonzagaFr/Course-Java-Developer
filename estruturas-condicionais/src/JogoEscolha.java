import java.util.Scanner;

public class JogoEscolha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 10;

        System.out.print("Chute um número: ");
        int numeroEscolhido = scanner.nextInt();

        String resultado = numero >= numeroEscolhido ? (numero == numeroEscolhido ? "Igual" : "Menor") : "Maior";
        System.out.println(resultado);
    }
}

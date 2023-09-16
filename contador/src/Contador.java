import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroInicial;
        int numeroFinal;

        System.out.print("Informe o número inicial da contagem: ");
        numeroInicial = scanner.nextInt();

        System.out.print("Informe o número final da contagem: ");
        numeroFinal = scanner.nextInt();

        contador(numeroInicial, numeroFinal);

    }

    static void contador(int numeroInicial, int numeroFinal) {
            int contador = 1;
            try {
                if(numeroFinal < numeroInicial) {
                    throw new ParametrosInvalidosException(numeroInicial, numeroFinal);
                }
            } catch (ParametrosInvalidosException e) {
                System.out.println(e);
            }
            for(int i = numeroInicial; i <= numeroFinal; i++ ){
                System.out.println("Nº"+(contador)+": "+i);
                contador++;
            }
    }
}

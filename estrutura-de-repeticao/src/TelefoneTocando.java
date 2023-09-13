import java.util.Random;

public class TelefoneTocando {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            System.out.println("Chamando...");

        }while(verificarLigacao());

        System.out.println("Em ligação...");

    }

    private static boolean verificarLigacao() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + (atendeu?"sim":"não"));
        return ! atendeu;
    }
}

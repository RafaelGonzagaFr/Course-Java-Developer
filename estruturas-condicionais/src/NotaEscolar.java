public class NotaEscolar {
    public static void main(String[] args) {
        double nota = 4.0;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}

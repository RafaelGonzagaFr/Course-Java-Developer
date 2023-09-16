import java.util.concurrent.ThreadLocalRandom;

public class Mesada {
    public static void main(String[] args) {
        double mesada = 50.0;
        System.out.println(mesada);
        /* 
        while (mesada > 0) {
            Double valorDoce = randomValue();
            System.out.println(mesada);
            if(mesada == 3) {
                System.out.println("Tem pouco dinheiro, voltar para casa");
                break;
            }
            System.out.println(valorDoce);
            System.out.println(valorDoce + ">" + mesada);
            System.out.println(valorDoce>mesada);
            if (valorDoce > mesada) {
                System.out.println("Mesada insuficiente para este doce");
                continue;
            }
            mesada -= valorDoce;
            System.out.printf("Dinheiro gasto: R$%.2f", valorDoce);
            System.out.printf("\nMesada: R$%.2f", mesada);
        }
        System.out.println("Voltou para casa");*/
        while(mesada > 0) {
            double valorDoce = randomValue();
            if(valorDoce > mesada){
                System.out.println("Mesada R$" + mesada + "Valor do doce R$" + valorDoce + ", dinheiro já está pouco, irei voltar para casa");
                break;
            } else {
                System.out.println("Mesada R$" + mesada + "Valor do doce R$" + valorDoce + ", ainda da pra comprar");
            }

            mesada -= valorDoce;
        }
        System.out.println("Voltei para casa");
    }

    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(2, 5);
    }
}

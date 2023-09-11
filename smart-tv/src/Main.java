public class Main {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.canal);
        System.out.println(smartTv.estado);
        System.out.println(smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(20);


        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.mudarCanal(20);

        System.out.println(smartTv.canal);
        System.out.println(smartTv.estado);
        System.out.println(smartTv.volume);

        smartTv.desligar();

        System.out.println(smartTv.estado);
    }
}

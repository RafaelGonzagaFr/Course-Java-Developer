public class App {
    public static void main(String[] args) {
        Fila<String> fila = new Fila();

        fila.enqueue("1");
        fila.enqueue("2");

        fila.dequeue();

        System.out.println(fila.toString());
    }
}

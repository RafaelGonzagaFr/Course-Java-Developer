public class App {
    public static void main(String[] args) {
        ListaCircular<String> lista = new ListaCircular<>();

        lista.add("Rafael");
        System.out.println(lista.toString());
        lista.add("Higor");
        System.out.println(lista.toString());

        lista.add("Wesley");
        System.out.println(lista.toString());

        lista.remove(2);
        System.out.println(lista.toString());

        System.out.println(lista.get(1));
    }
}

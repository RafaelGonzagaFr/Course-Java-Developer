public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();


        minhaListaEncadeada.add("Rafael");
        minhaListaEncadeada.add("Higor");
        minhaListaEncadeada.add("Wesley");

        System.out.println(minhaListaEncadeada.get(0));

        System.out.println(minhaListaEncadeada.toString());
        
        minhaListaEncadeada.remove(1);

        System.out.println(minhaListaEncadeada.get(1));

        System.out.println(minhaListaEncadeada.toString());
    }
}

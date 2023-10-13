public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("Rafael");
        System.out.println(lista.toString());
        lista.add("Higor");
        System.out.println(lista.toString());
        lista.add("Wesley");
        System.out.println(lista.toString());    
        lista.add(2, "Teste");
        System.out.println(lista.toString());  
        lista.remove(2);
        System.out.println(lista.toString());    
        
    }
}

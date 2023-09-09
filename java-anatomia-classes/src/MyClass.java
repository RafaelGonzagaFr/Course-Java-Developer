public class MyClass {
    public static void main(String[] args) {       
        System.out.println("Primeira classe");

        //Constantes
        final String BR = "Brasil";

        String primeiroNome = "Rafael";
        String segundoNome = "Gonzaga";
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    }

    //Método
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

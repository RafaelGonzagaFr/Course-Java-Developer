public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    //Nomes dos métodos devem ser um verbo e únicos segundo a sua responsabilidade
    
    //Método público (visível para outras classes), tem retorno (double)
    public double somar (int number1, int number2) {
        return number1 + number2;
    }

    //Método sem retorno (void)
    public void imprimir (String texto) {
        System.out.println(texto);
    }

    //Método privado (não visível para outras classes), possui exceção
    private double dividir (int dividendo, int divisor) throws Exception {
        return dividendo/divisor;
    }
}

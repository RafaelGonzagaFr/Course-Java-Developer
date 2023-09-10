public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*operadores aritméticos, unários, relacionais, lógicos e ternário*/ 
        //Aritméticos
        //soma
        double soma = 10.5 + 11.2;
        //subtração
        double subtracao =  11 - 12;
        //multiplicação
        double mutiplicao =  2 * 5;
        //divisão
        double divisao = 41 / 2.5;
        //modulo
        double  modulo = 2 % 2;

        //concatenacao
        String nomeCompleto = "Rafael" + "Gonzaga";

        //Unários
        int numero = 5;
        numero = - numero;
        numero = numero * -1;
        numero += numero;
        numero -= numero;
        numero *= numero;
        numero /= numero;
        numero++;
        numero--;
        ++numero;
        --numero;

        //operadores relacionais
        boolean relacao = 4 > 2;
        relacao = 4 < 2;
        relacao = 4 == 2;
        relacao = 4 != 2;
        relacao = 4 <= 2;
        relacao = 4 >= 2;

        //operadores logicos
        boolean logica = (4>2) || (4==4);
        logica = (4>2) && (2==2);

        //operadores ternario
        String resultado = 1==1 ? "verdadeiro" : "falso";
    }
}

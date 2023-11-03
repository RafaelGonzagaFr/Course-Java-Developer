import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) throws Exception {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("John"));
            add(new Gato("Baby"));
            add(new Gato("Frusciante"));

        }};

        System.out.println(meusGatos);

        /*meusGatos.sort(new Comparator<Gato>(){
            @Override
            public int compare(Gato g1, Gato g2) {
                return g1.getName().compareToIgnoreCase(g2.getName());
            }
        });*/ //Método anônimo

        // meusGatos.sort(Comparator.comparing(gato -> gato.getName())); Lambda Expression
        meusGatos.sort(Comparator.comparing(Gato::getName)); //Reference method

        System.out.println(meusGatos);

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        
        numerosAleatorios.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList())
            .forEach(System.out::print);

        System.out.println("\n");

        //Números pares e maiores do que dois
         List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
            .map(Integer::parseInt)
            .filter(i -> i % 2 == 0 && i > 2)
            .collect(Collectors.toList());

        System.out.println(listaParesMaioresQue2);

    }
}

class Gato {
    private String name;

    Gato(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name;
    }
}


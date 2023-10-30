import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAula {
    public static void main(String[] args) throws Exception {
        //Métodos set
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        int numeros[] = {1,2,3,4,5,6};

        System.out.println(notas);
        System.out.println(notas.contains(5d));
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Soma dos valores das notas: " + soma);
        System.out.println("Média dos valores da notas: " + soma/notas.size());

        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        
        System.out.println(notas);

        Set<Double> temperaturas = new LinkedHashSet<>();
        temperaturas.add(31.5);
        temperaturas.add(32.1);
        temperaturas.add(40d);

        System.out.println(temperaturas);

        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);        
    }
}

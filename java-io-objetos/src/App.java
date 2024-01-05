import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws Exception {
        //serializacao();
        desserializacao("C:\\Users\\RGonzaga\\Documents\\dev\\dio\\Course-Java-Developer\\java-io-objetos\\gato");
    }

    public static void serializacao() throws FileNotFoundException, IOException{
        Gato gato = new Gato("Simba", 6, "amarelado", true, false);

        File f = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Arquvio \"%s\" criado com sucesso! Tamanho '%d' bytes", f.getName(), f.length());

        oos.close();
        ps.close();
    }

    public static void desserializacao(String arquivo) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));

        Gato objetoGato = (Gato) ois.readObject();

        System.out.printf("Nome: %s\n", objetoGato.getNome());
        System.out.printf("Idade: %d\n", objetoGato.getIdade());
        System.out.printf("Cor: %s\n", objetoGato.getCor());
        System.out.println("Castrado: "+(objetoGato.isCastrado()==true?"sim":"não")+"");
        System.out.println("Ronrona: "+(objetoGato.isRonrona()==true?"sim":"não")+"");
        System.out.println(objetoGato);

        
        ois.close();
    }
}

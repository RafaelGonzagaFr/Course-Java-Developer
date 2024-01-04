import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class App {
    public static void main(String[] args) throws Exception {
        copiarArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\Users\\GrupoLA\\Documents\\dev\\Course-Java-Developer\\java-io-ex3\\recomendacoes.txt");
        String nameArquivo = f.getName();

        /*Reader r = new FileReader(nameArquivo);
        BufferedReader br = new BufferedReader(r);*/
        
        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));
        String line = br.readLine();

        String nameArquivoCopy = nameArquivo.substring(0, nameArquivo.indexOf(".")).concat("-copy.txt");

        File fcopy = new File(nameArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while(!(line==null));

        System.out.printf("Arquivo \"%s\" copiado com sucesso\n", f.getName());
        System.out.printf("Arquivo \"%s\" criado com sucesso\n", fcopy.getName());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());

        pw.println("Arquivo copiado");

        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!(line.equalsIgnoreCase("fim")));
        br.close();
        bw.close();
    }
}

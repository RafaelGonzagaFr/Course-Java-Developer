import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        incluirProduto();
    }

    public static void incluirProduto() throws IOException {
        File f = new File("C:\\Users\\GrupoLA\\Documents\\dev\\roupas\\peca-de-roupa.txt");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner scan = new Scanner(System.in);

        ps.print("Nome da peça:");
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        ps.print("Tamanho da peça (P/M/G/U): ");
        char tamanho = (char)System.in.read();
        dos.writeChar(tamanho);

        ps.print("Quantidade: ");
        int quant = scan.nextInt();
        dos.writeInt(quant);

        ps.print("Preço unitário: ");
        double preco = scan.nextDouble();
        dos.writeDouble(preco);

        lerProduto(f.getPath());

        dos.close();
        scan.close();

    }

    public static void lerProduto(String arquivo) throws IOException {
        File f = new File(arquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double preco = dis.readDouble();

        System.out.println("Nome: "+nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Tamanho: " + tamanho);                
        System.out.println("Preço: "+preco);  
        System.out.println("Total: "+(quantidade*preco)); 
        
        dis.close();
    }
}

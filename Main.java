import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File documento = new File("/workspaces/LavorareSuFile/doc.txt");
        Scanner scanner;
        try{
            scanner = new Scanner(documento);
        }catch(FileNotFoundException eccezione){
            throw eccezione;
        }
        String contenuto = "";
        while (scanner.hasNextLine()) {
            contenuto = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Ciao " + contenuto);

        FileReader documento1 = new FileReader("/workspaces/LavorareSuFile/doc.txt");
        BufferedReader fileBuffered = new BufferedReader(documento1);
        try {
            String riga = fileBuffered.readLine();
        }catch(IOException eccezione){
            throw eccezione;
        }
        documento1.close();
        fileBuffered.close();

        PrintWriter stampa = new PrintWriter();
    }


}

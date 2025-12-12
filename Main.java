import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
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
    }
}

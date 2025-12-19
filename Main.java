import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("atleti.csv");
        String[] righeLette = GestioneFile.leggiFile(file);
        Atleta[] atleti = new Atleta[righeLette.length-1];
        for(int i = 1; i<righeLette.length; i++){
            String[] rigaSplit = righeLette[i].split(", ");
            atleti[i-1] = new Atleta(rigaSplit[0], rigaSplit[1], rigaSplit[2], rigaSplit[3], Integer.parseInt(rigaSplit[4]), Integer.parseInt(rigaSplit[5]), Integer.parseInt(rigaSplit[6]));
        }
    }


}

import java.io.*;
public class GestioneFile {
    public static String[] leggiFile(File file) throws IOException{
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int numeroRighe = (int) (br.lines().count());
        br.close();
        br = new BufferedReader(new FileReader(file));
        String[] righe = new String[numeroRighe];
        for(int i = 0; i<numeroRighe; i++){
            righe[i] = br.readLine();
        }
        br.close();
        return righe;
    }
}

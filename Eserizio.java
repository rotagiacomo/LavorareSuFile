import java.io.*;
public class Eserizio {
    public String[] leggiFile(String url) throws FileNotFoundException{
        try {
            FileReader fr = new FileReader(url);
            BufferedReader br = new BufferedReader(fr);
            int numeroRighe = (int) (br.lines().count());
            String[] righe = new String[numeroRighe];
            for(int i = 0; i<numeroRighe; i++){
                righe[i] = br.lines().toString();
            }
            return righe;
        }catch(FileNotFoundException eccezione){
            throw eccezione;
        }
    }
}

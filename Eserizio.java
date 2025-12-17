import java.io.*;
public class Eserizio {
    private String[] righeLette;
    public void leggiFile(String url) throws IOException{
        try {
            FileReader fr = new FileReader(url);
            BufferedReader br = new BufferedReader(fr);
            int numeroRighe = (int) (br.lines().count()); //consuma tutto lo stream
            br.close(); //chiude br e fr
            br = new BufferedReader(new FileReader(url)); //riapro un nuovo stream
            righeLette = new String[numeroRighe];
            for(int i = 0; i<numeroRighe; i++){
                righeLette[i] = br.readLine();
            }
            br.close();
        }catch(IOException eccezione){
            throw eccezione;
        }
    }

    public void stampaRigheLette(){
        for (int i = 0; i<righeLette.length; i++){
            System.out.println(righeLette[i]);
        }
    }

    public void creaFileCopia(String urlCopia) throws IOException{
        try {
            FileWriter fw = new FileWriter(urlCopia);
            PrintWriter pr = new PrintWriter(fw);
            for (int i = 0; i<righeLette.length; i++){
                pr.println(righeLette[i]);
            }
            pr.close(); //chiude e stampa le righe
        }catch (IOException eccezione){
            throw eccezione;
        }
    }
}

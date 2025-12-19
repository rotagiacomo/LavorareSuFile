public class Atleta {
    private String nome;
    private String cognome;
    private String sport;
    private String squadra;
    private int eta;
    private int partiteGiocate;
    private int puntiSegnati;

    public Atleta(String nome, String cognome, String sport, String squadra, int eta, int partiteGiocate, int puntiSegnati){
        this.nome = nome;
        this.cognome = cognome;
        this.sport = sport;
        this.squadra = squadra;
        this.eta = eta;
        this.partiteGiocate = partiteGiocate;
        this.puntiSegnati = puntiSegnati;
    }

    public String toString(){
        return "[nome: " + nome + ", cognome: " + cognome + ", sport: " + sport + ", squadra: " + squadra + ", eta: " + eta + ", partite: " + partiteGiocate + ", punti: " + puntiSegnati + "]";
    }
}

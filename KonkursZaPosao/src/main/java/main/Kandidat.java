package main;

public class Kandidat {
    String ime;
    String prezime;
    int godine;

    public Kandidat(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    @Override
    public String toString() {
        return "Kandidat{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                '}';
    }

    public boolean contains(){
        
        return;
    }
}

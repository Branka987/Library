package bibliotekaa;

import java.util.ArrayList;

public class Polica implements Comparable<Polica> {
    private static int ID = 1;
    private int id;
    private ArrayList<Knjiga> listaKnjiga;

    public Polica() {
        this.id = ID;
        Polica.ID++;
        listaKnjiga = new ArrayList<>();
    }

    public ArrayList<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void dodajKnjigu(Knjiga knjiga) {
        listaKnjiga.add(knjiga);
    }

    public String ocitiNaslov(String naslov) {
        return naslov.toUpperCase().trim();
    }

    public Knjiga nadjiPoNaslovu(String naslov) {
        for (Knjiga knjiga : listaKnjiga) {
            if (knjiga.getNaslov().equalsIgnoreCase(ocitiNaslov(naslov))) {
                return knjiga;
            }
        }
        System.out.println("Nema ta knjiga u ponudi.");
         return null;
    }

    public Knjiga nadjiPoAutoru(String autor) {
        for (Knjiga knjiga : listaKnjiga) {
            if (knjiga.getAutor().equalsIgnoreCase(ocitiNaslov(autor))) {
                return knjiga;
            }
        }
        return null;
    }

    // U paketu biblioteka postoji Polica. Polica ima jedinstveni, automatski generisani celobrojni identifikator i listu knjiga.
    // Lista se stvara prazna, a knjige se kasnije dodaju pojedinačno jedna po jedna.
    // Moguće je pronaći jednu knjigu po naslovu (metoda vraća jednu knjigu)
    // i sve knjige po imenu autora (metoda vraća listu knjiga).
    // Moguće je vratiti listu svih knjiga sortirano abecedno po naslovu.
    public String vratiListuKnjiga(Polica polica) {
        String pomoc = "-- ";
       for (Knjiga knjiga: listaKnjiga){
          pomoc += knjiga + "\n";
       }
       return pomoc;
    }

    @Override
    public int compareTo(Polica o) {
        if (this.listaKnjiga.equals(o.listaKnjiga)) {
            return 0;
        }
        return 1;
    }
    // Ispisuje se u formatu:  Npr. Polica
    // #### ---------------------------------------------
    // - knjiga1
    // - knjiga2 …
    // ---------------------------------------------
    // Polica 1 --------------------------------------------------
    // - Hajduci, Branislav Nusic, 1933, roman - Mali princ, Antoan de Sent Egziperi, 1943, novela - Koreni,
    // Dobrica Ćosić, 1954, roman - Na Drini Cuprija, Ivo Andric, 1945, Istorijski roman
    // Prilikom ispisivanja, knjige izlistati sortirano po naslovu


    @Override
    public String toString() {
        String str = "Polica " + id + "\n";
        String linija ="-------------------------------------------------------------------------------";
        str+=linija;
        for (Knjiga knjiga: listaKnjiga){
            str += "\n- " + knjiga;
        }
        str += "\n" + linija;
        return str;
    }
}

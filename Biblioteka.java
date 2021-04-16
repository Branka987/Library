package bibliotekaa;

import java.util.ArrayList;

public class Biblioteka {
    //U paketu biblioteka postoji Biblioteka koja ima adresu, listu Polica, listu Časopisa i listu Čitaoca.
    private String adresa;
    private ArrayList<Polica>listaPolica;
    private ArrayList<Casopis>listaCasopisa;
    private ArrayList<Citalac>listaCitaoca;

    public Biblioteka(String adresa) {
        this.adresa = adresa;
        listaCasopisa = new ArrayList<>();
        listaCitaoca = new ArrayList<>();
        listaPolica = new ArrayList<>();
    }
public void dodajCitaoca(Citalac citalac){
        listaCitaoca.add(citalac);
}
public void dodajCasopis(Casopis casopis){
        listaCasopisa.add(casopis);
}
public void dodajPolicu(Polica polica){
        listaPolica.add(polica);
}
    // Liste se stvaraju prazne, a elementi se kasnije dodaju jedan po jedan – za svaku listu definisati posebnu metodu za dodavanje.
    // Može se vratiti jedna knjiga po naslovu iz liste polica.
    public Knjiga vratiKnjiguPoNaslovu(String naslov){
        for (Polica polica: listaPolica){
            return polica.nadjiPoNaslovu(naslov);
        }
        return null;
    }
    // Može se vratiti lista knjiga po imenu autora iz liste polica.

    public Knjiga vratiListuKnjiga(String autor){
        for (Polica polica: listaPolica){
            return polica.nadjiPoAutoru(autor);
        }
        return null;
    }
    // Može se vratiti jedan časopis iz liste časopisa po naslovu.
    public Casopis vratiCasopis(String naslov){
        for (Casopis casopis: listaCasopisa){
            if (casopis.getNaslov().equalsIgnoreCase(naslov)){
                return casopis;
            }
        }
        return null;
    }
    // Može se vratiti jedan čitalac po broju članske karte.
    public Citalac vratiCitaoca(int br){
        for (Citalac citalac: listaCitaoca) {
            if (br == citalac.getBrojClanskeKarte())
                return citalac;
        }
        return null;
    }
    // Biblioteka se prikazuje u formatu:
    //Adresa
    // **************************
    // Polica1
    // Polica2
    // **************************
    // Časopis1 Časopis2
    // **************************
    // Čitalac1 Čitalac2


    @Override
    public String toString() {
        String pomoc = "Biblioteka: " + adresa;
        String linija = "***************************************************";
        pomoc+= linija+ "\n";
        for(Polica polica: listaPolica){
            pomoc+= polica;
        }
        pomoc+= "\n" + linija + "\n";
        for (Casopis casopis: listaCasopisa){
            pomoc += casopis;
        }
        pomoc+= "\n" + linija + "\n";
        for (Citalac citalac: listaCitaoca){
            pomoc += citalac;
        }
        pomoc+= "\n" + linija + "\n";
        return pomoc;
    }
}

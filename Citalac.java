package bibliotekaa;

import java.time.LocalDate;
import java.util.HashMap;

public class Citalac {
    private String ime, prezime;
    private int brojClanskeKarte, dan, mesec, godina;
    private LocalDate datumUclanjivanja;
    private LocalDate datumIznajmljivanjaKnjige = LocalDate.now();
    private HashMap<Spis, LocalDate> mapaSpisa;
    private LocalDate istekClanrine;

    public Citalac(String ime, String prezime, int brojClanskeKarte, int dan, int mesec, int godina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojClanskeKarte = brojClanskeKarte;
        this.dan = dan;
        this.mesec = mesec;
        this.godina = godina;
        mapaSpisa = new HashMap<>();
        istekClanrine = LocalDate.now();
        datumIznajmljivanjaKnjige = LocalDate.now();
    }

    public int getDan() {
        return dan;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public int getBrojClanskeKarte() {
        return brojClanskeKarte;
    }

    // U paketu biblioteka postoji Čitalac. Čitalac ima ime i prezime, broj članske karte,
    // datum učlanjivanja i mapu iznajmljenih spisa (ključ je Spis, vrednost je LocalDate).
    // Mapa spisa se stvara prazna, a spisi se kasnije dodaju jedan po jedan (spis, današnji datum).
    public void dodajSpis(Spis mapa){
        if (proveriClanarinu() != false ) {
            mapaSpisa.put(mapa, datumIznajmljivanjaKnjige);
        }
    }
    // Spis se može dodati u mapu ako nije istekla članarina.
    public boolean proveriClanarinu (){
      /* if(this.godina < istek ||
                this.godine == datum.godine &&  this.mesec < datum.mesec ||
                this.godine == datum.godine && this.mesec == datum.mesec;*/
      if   (godina <= datumIznajmljivanjaKnjige.getYear()
                && mesec <= datumIznajmljivanjaKnjige.getMonthValue()
                && dan >= datumIznajmljivanjaKnjige.getDayOfMonth()) {
          return true;
      }
      return  false;
        }
        public void ukloniSpis(Spis spis){
        mapaSpisa.remove(spis);
        }
        public String produziClanarinu(){
        String pomoc = "Clanarina je produzena do: ";
        if (proveriClanarinu() == false){
           int g = datumIznajmljivanjaKnjige.getYear() +1;
           int m = datumIznajmljivanjaKnjige.getMonthValue();
           int d = datumIznajmljivanjaKnjige.getDayOfMonth();
            pomoc += d + ". " + m +". " + g;
        }

        return pomoc;
        }
    // Napraviti metodu koja ispituje da li je istekla članarina – članarina je istekla ako je
    //prošlo više od godinu dana od datuma članarine.
    // Kada čitalac vrati spis, spis se može ukloniti iz njegove mape iznajmljenih knjiga.
    // Čitalac može produžiti članarinu, pri čemu se datum članarine postavlja na današnji datum.
    // Čitalac se ispisuje u formatu:
    // Npr. Ime i prezime, br. članske karte, datum učlanjivanja
    // ---------------------------------------------
    // - spis1 (datum iznajmljivanja)
    // - spis2 (datum iznajmljivanja) …
    // ---------------------------------------------
    // Pera Perić, 10151, 15.4.2018.
    // --------------------------------------------------
    // - Hajduci, Branislav Nusic, 1933, roman (1.3.2019.)
    // - National Geographic, 3/2019 (14.2.2019.)

    @Override
    public String toString() {
        String pomoc ="- " + ime +"  "+ prezime + ", " + brojClanskeKarte + ", " + dan + "." + mesec +"." + godina ;
        String linija ="-------------------------------------------------------------------------------";
        pomoc += "\n" + linija +"\n";
        for (Spis spis:mapaSpisa.keySet()){
            pomoc+= spis.getNaslov() + " (" + datumIznajmljivanjaKnjige.getDayOfMonth() +". "+ datumIznajmljivanjaKnjige.getMonthValue() +". " + datumIznajmljivanjaKnjige.getYear()+")"+"\n";
        }
        pomoc += linija;
        return pomoc;
    }


}

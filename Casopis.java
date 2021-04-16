package bibliotekaa;

import java.time.LocalDate;

public class Casopis extends Spis{
    private LocalDate datumIzdanja;
    int dan, mesec, godina;

    public Casopis(String naslov, int brStrana) {
        super(naslov, brStrana);
      datumIzdanja = LocalDate.of(2018,3,16);

    }


    public LocalDate getDatumIzdanja() {
        return datumIzdanja;
    }
    //U paketu biblioteka postoji Časopis. Časopis je Spis koji ima naslov, broj strana i datum izdanja.
    // Časopisu se može vratiti datum izdanja (koristiti LocalDate).
    // Ispisuje se u formatu naslov, mesec izdanja/godina izdanja. (npr. National Geographic, 3/2019)


    @Override
    public String toString() {
        return naslov + ", " + datumIzdanja.getMonthValue() + "/ " + datumIzdanja.getYear();
    }
}

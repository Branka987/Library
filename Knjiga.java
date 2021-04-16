package bibliotekaa;

public class Knjiga extends Spis {
    private String autor, zanr;
    private int godIzdanja;

    public Knjiga(String naslov, int brStrana, String autor, String zanr, int godIzdanja) {
        super(naslov, brStrana);
        this.autor = autor;
        this.zanr = zanr;
        this.godIzdanja = godIzdanja;
    }

    public String getAutor() {
        return autor;
    }

    public String getZanr() {
        return zanr;
    }

    public int getGodIzdanja() {
        return godIzdanja;
    }

    @Override
    public String toString() {
        return naslov + ", " + autor + ", " + godIzdanja + ", "+ zanr;
    }
    // U paketu biblioteka postoji Knjiga. Knjiga je Spis koji ima naslov, Autora, žanr, godinu izdanja i broj strana.
    // Knjizi se mogu vratiti autor, žanr i godina izdanja.
    // Ispisuje se u formatu naslov, autor, godina izdanja, žanr (npr. Na Drini Cuprija, Ivo Andric, 1945, Istorijski roman
}

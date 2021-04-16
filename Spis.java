package bibliotekaa;

public class Spis {
    //U paketu biblioteka postoji Spis.
    // Spisu se može vratiti naslov i broj strana.
    protected String naslov;
    protected int brStrana;

    public Spis(String naslov, int brStrana) {
        this.naslov = naslov;
        this.brStrana = brStrana;
    }

    public String getNaslov() {
        return naslov;
    }

    public int getBrStrana() {
        return brStrana;
    }
}

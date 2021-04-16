package bibliotekaa;

public class Autor {
    //U paketu biblioteka postoji Autor.
    // Autor ima ime, prezime i godinu rođenja.
    // Može se vratiti godina rođenja.
    // Ispisuje se u formatu ime prezime (npr. Ivo Andric)

    private String ime, prezime;
    private int godinaRodjenja;

    public Autor(String ime, String prezime, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaRodjenja = godinaRodjenja;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}

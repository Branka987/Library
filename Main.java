package com.company;

import bibliotekaa.*;

public class Main {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Vuk","Draskovic",1947);
        Autor autor2 = new Autor("Ivo","Andric",1898);
        Autor autor3 = new Autor("Dusko","Radovic", 1931);
        Autor autor4 = new Autor("Branko", "Copic",1914);
        Autor autor5 = new Autor ("Desanka","Maksimovic",1921);

        Spis spis1 = new Spis("Politikin zabavnik",50);
        Spis spis2 = new Spis ("Mikijev zabavnik", 45);
        Spis spis3 = new Spis("Decije novine",48);


        Knjiga knjiga1 = new Knjiga("Noz",325,"Vuk Draskovic", "drama", 2000);
        Knjiga knjiga2 = new Knjiga("Na Drini cuprija",400,"Ivo Andric","roman",1956);
        Knjiga knjiga3 = new Knjiga("Gospodjica",180,"Ivo Andric","roman",1958);
        Knjiga knjiga4 = new Knjiga("Magarce godine",214,"Branko Copic","deciji roman",1970);
        Knjiga knjiga5 = new Knjiga("Zbirka pesama 1", 428,"Desanka Maksimovic","poezija",1950);
        Knjiga knjiga6 = new Knjiga("Zbirka pesama 2", 433, "Desanka Maksimovic","poezija",1950);
        Knjiga knjiga7 = new Knjiga("Vukova azbuka",100, "Dusko Radovic", "decije pesme", 1978);
        Knjiga knjiga8 = new Knjiga("Zooloski vrt",80,"Dusko Radovic", "decije pesme", 1978);
        Knjiga knjiga9 = new Knjiga("Prokleta avlija",189,"Ivo Andric","roman",1960);
        Knjiga knjiga10 = new Knjiga("Aska i vuk", 72, "Ivo Andric", "deciji roman", 1960);

       Casopis casopis1 = new Casopis("Vecernje novosti", 60);
        Casopis casopis2 = new Casopis("Politika",40);
        Casopis casopis3 = new Casopis("Blic", 50);
        Casopis casopis4 = new Casopis("Informer",54);
        Casopis casopis5 = new Casopis("Kurir",48);
        System.out.println(casopis1);

        Polica polica1 = new Polica();
        polica1.dodajKnjigu(knjiga2);
        polica1.dodajKnjigu(knjiga10);
        polica1.dodajKnjigu(knjiga6);
        System.out.println("=============================== POLICA 1 ======================================");
        System.out.println(polica1);

        Polica polica2 = new Polica();
        polica2.dodajKnjigu(knjiga3);
        polica2.dodajKnjigu(knjiga7);
        polica2.dodajKnjigu(knjiga8);
        polica2.dodajKnjigu(knjiga9);
        System.out.println("=============================== POLICA 2 ======================================");
        System.out.println(polica2);

        Polica polica3 = new Polica();
        polica3.dodajKnjigu(knjiga1);
        polica3.dodajKnjigu(knjiga4);
        polica3.dodajKnjigu(knjiga5);
        System.out.println("=============================== POLICA 3 ======================================");
        System.out.println(polica3);
        System.out.println( polica3.vratiListuKnjiga(polica3));
        System.out.println("=============================== PO AUTORU =====================================");
        System.out.println(polica2.nadjiPoAutoru("Ivo Andric"));
        System.out.println("=============================== PO NASLOVU =====================================");
        System.out.println(polica2.nadjiPoNaslovu("Noz"));
        System.out.println("=============================== PO NASLOVU =====================================");
        System.out.println(polica2.nadjiPoNaslovu("Gospodjica"));

        System.out.println();
        System.out.println("================================== CITALAC I SPISI =============================");

        Citalac citalac1 = new Citalac("Branka","Tasic",1603,16,3,2020);
        Citalac citalac2 = new Citalac("Branislav","Tasic",608,6,8,2018);

       citalac1.dodajSpis(spis1);
       citalac1.dodajSpis(spis2);
        System.out.println(citalac1);
        citalac2.dodajSpis(spis1);
        System.out.println(citalac2);

        Biblioteka biblioteka1 = new Biblioteka("Nikole Marakovica");
        Biblioteka biblioteka2 = new Biblioteka("Nikole Marakovica");

        biblioteka1.dodajCasopis(casopis1);
        biblioteka1.dodajCasopis(casopis2);
        biblioteka1.dodajCitaoca(citalac1);
        biblioteka1.dodajPolicu(polica3);

        System.out.println();
        System.out.println("================================== BIBLIOTEKA ==================================");
        System.out.println(biblioteka1);
        System.out.println();
        System.out.println("================================== BIBLIOTEKA pojedinacne komande ==================================");
        System.out.println(biblioteka1.vratiCitaoca(1603));
        System.out.println(biblioteka1.vratiKnjiguPoNaslovu("Noz"));
        System.out.println(biblioteka1.vratiListuKnjiga("Vuk Draskovic"));
        System.out.println(biblioteka1.vratiCasopis("Vecernje novosti"));

        System.out.println();
        System.out.println("================ PRODUZETAK CLANARINE =======================================");

        System.out.println(citalac2.proveriClanarinu());
        System.out.println(citalac2.produziClanarinu());

    }
}

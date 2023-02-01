package sk.tmconsulting.model;

import java.util.ArrayList;

public class Knihy {

    public ArrayList<Kniha> naplnKniznicuKnihami() {
        Kniha kniha1 = new Kniha();
        kniha1.setNazov("Ja,robot");
        kniha1.setMenoAutora("Issac Asimov"); //naplnili sme knihu1 autorom
        kniha1.setRokVydania(1965);

        Kniha kniha2 = new Kniha();  //vytvorenie prazdnej knihy,cize objektu = instancie
        kniha2.setNazov("Duna"); //naplnili sme knihu1 nazvom
        kniha2.setMenoAutora("Frank P.Herbert"); //naplnili sme knihu1 autorom
        kniha2.setRokVydania(1970);

        ArrayList<Kniha> testovaciaKniznica = new ArrayList<Kniha>();
        testovaciaKniznica.add(kniha1);
        testovaciaKniznica.add(kniha2);

        return testovaciaKniznica;
    }
}

package sk.tmconsulting.model;

import java.util.ArrayList;

public class Knihy {

    //vratime ArrayList s naplnenymi udajmi
    public ArrayList<Kniha> naplnKniznicuKnihami() {
        Kniha kniha1 = new Kniha();
        kniha1.setNazov("Ja,robot");
        kniha1.setMenoAutora("Issac Asimov"); //naplnili sme knihu1 autorom
        kniha1.setRokVydania(1965);

        Kniha kniha2 = new Kniha();  //vytvorenie prazdnej knihy,cize objektu = instancie
        kniha2.setNazov("Duna"); //naplnili sme knihu1 nazvom
        kniha2.setMenoAutora("Frank P.Herbert"); //naplnili sme knihu1 autorom
        kniha2.setRokVydania(1970);

        ArrayList<Kniha> kniznicaPole = new ArrayList<Kniha>();
        kniznicaPole.add(kniha1);
        kniznicaPole.add(kniha2);

        return kniznicaPole; //metoda vracia nase naplnene pole

    }

    public ArrayList<Kniha> vyhladaneKnihy(ArrayList<Kniha> kniznicaSoVsetkymiKnihami, String hladanyNazov) {
//musime naprogramovat logiku ako ma vyhladat knihy podla hladanyNazov
        ArrayList<Kniha> najdeneKnihy = new ArrayList<Kniha>(); //najdeneKnihy je kolekcia,cize ArrayList najdenych knih,na zaciatku je prazdny

        for (Kniha kniha : kniznicaSoVsetkymiKnihami) {  //prechadzame kazdou knihou v ArrayListe kniznicaSoVsetkymiKnihami
            // a v jej nazve hladame cez prikaz (metodu) contains ci obsahuje slovo v premennej hladanyNazov
            // ak ten nazov alebo jej cast tam je, tak ...

            if (kniha.getNazov().toLowerCase().contains(hladanyNazov.toLowerCase())) { //a v jej nazve hladame cez prikaz (metodu) contains ci obsahuje slovo v premennej hladanyNazov
                najdeneKnihy.add(kniha); //....pridame do najdeneKnihy danu knihu
            }
        }

        return najdeneKnihy;

    }
}

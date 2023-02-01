package sk.tmconsulting.model;

public class Kniha {
    //zadefinovali sme si premenne triedy cize "fields" triedy
    private String nazov;
    private String menoAutora;
    private int rokVydania;

    // setter a getter su metody...v nazve maju set(nastavujem,naplnam) a get(ziskavam)

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public String getMenoAutora() {
        return menoAutora;
    }

    public void setMenoAutora(String menoAutora) {
        this.menoAutora = menoAutora;
    }

    public int getRokVydania() {
        return rokVydania;
    }

    public void setRokVydania(int rokVydania) {
        this.rokVydania = rokVydania;
    }
}

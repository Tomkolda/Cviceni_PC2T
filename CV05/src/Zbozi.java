public abstract class Zbozi {
    private String nazev;
    private double cenabezdph;
    private static double dph = 1.21;

    public Zbozi(String nazev, double cenabezdph) {
        this.nazev = nazev;
        this.cenabezdph = cenabezdph;
    }

    public String getNazev(){
        return this.nazev;
    }

    public void setNazev(String nazev){
        this.nazev=nazev;
    }

    public double getCena(){
        return this.cenabezdph*dph;
    }

    public void setCenabezdph(double cena){
        this.cenabezdph = cena;
    }
    public abstract String getJednotka();
}

public class BPIS implements Predmet{
    private String nazev;
    private int pocetbodu;

    public BPIS() {
        this.nazev="BPIS";
    }

    @Override
    public String getNazev() {
        return this.nazev;
    }

    @Override
    public int getPocetbodu() {
        return 0;
    }

    public void setZapocet(String zapocet){
        if (zapocet.equals("Ano")){
            this.pocetbodu = 100;
        }
        else {
            this.pocetbodu = 0;
        }
    }

    @Override
    public boolean zapocetUdelen() {
        if(this.pocetbodu > min){
            return true;
        }
        else {
            return false;
        }
    }
}

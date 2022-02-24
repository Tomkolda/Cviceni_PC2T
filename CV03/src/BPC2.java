public class BPC2 implements Predmet{

    private String nazev;
    private int pocetbodu;

    public BPC2() {
        this.nazev = "BPC2";
        this.pocetbodu = 0;
    }

    public void setBodyZaProjekt(int body_projekt){
        this.pocetbodu+=body_projekt;
    }

    public void setBodyZaSZkousku(int body_szkousku){
        this.pocetbodu+=body_szkousku;
    }

    public void setBodyZaZZkousku(int body_zzkousku){
        this.pocetbodu+=body_zzkousku;
    }

    @Override
    public String getNazev() {
        return this.nazev;
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

    @Override
    public int getPocetbodu() {
        return this.pocetbodu;
    }

}

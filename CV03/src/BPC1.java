public class BPC1 implements Predmet{

    private String nazev;
    private int pocetbodu;

    public BPC1() {
        this.nazev = "BPC1";
        this.pocetbodu = 0;

    }

    public void setBodyZaCviceni(int body_cviceni){
        this.pocetbodu+=body_cviceni;
    }

    public void setBodyZaZkousku(int body_zkousku){
        this.pocetbodu+=body_zkousku;
    }

    @Override
    public String getNazev() {
        return this.nazev;
    }

    @Override
    public boolean zapocetUdelen() {
        if(pocetbodu > min){
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

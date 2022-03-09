public class Potravina extends Zbozi{

    private int trvanlivost;
    public Potravina(String nazev, double cenabezdph, int trvanlivost) {
        super(nazev, cenabezdph);
        this.trvanlivost = trvanlivost;
    }

    public int getTrvanlivost() {
        return trvanlivost;
    }

    public void setTrvanlivost(int trvanlivost) {
        this.trvanlivost = trvanlivost;
    }

    @Override
    public String getJednotka() {
        return "dnu";
    }
}

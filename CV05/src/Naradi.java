public class Naradi extends Zbozi {
    private int zaruka;

    public Naradi(String nazev, double cenabezdph, int zaruka) {
        super(nazev, cenabezdph);
        this.zaruka = zaruka;
    }

    public int getZaruka() {
        return zaruka;
    }

    public void setZaruka(int zaruka) {
        this.zaruka = zaruka;
    }


    @Override
    public String getJednotka() {
        return "mesicu";
    }
}

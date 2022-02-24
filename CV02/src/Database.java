public class Database {
    private String name;
    private int year_born;
    private double work;
    static double max_work = 1.0;

    public Database(String name, int year_born) {
        this.name = name;
        this.year_born = year_born;
    }

    public String getName() {
        return name;
    }

    public int getYear_born() {
        return year_born;
    }

    public double getWork() {
        return work;
    }

    public static double getMax_work() {
        return max_work;
    }

    public static void setMax_work(double max_work) {
        Database.max_work = max_work;
    }

    public boolean new_work(double new_work){
        if (new_work + this.work > max_work){
            this.work = max_work;
            return false;
        }
        else {
            this.work = new_work + this.work;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", year_born=" + year_born +
                ", work=" + work +
                ", max_work=" + max_work +
                '}';
    }
}

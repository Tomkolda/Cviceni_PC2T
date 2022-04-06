public class Goat extends AbstractAnimal{
    public Goat(byte age) {
        super(age);
    }

    @Override
    public void sound() {
        System.out.println("Mee");
    }

    @Override
    public String toString() {
        return "Goat{" +
                "age=" + age +
                '}';
    }
}

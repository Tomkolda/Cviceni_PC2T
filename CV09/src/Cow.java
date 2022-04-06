public class Cow extends AbstractAnimal{
    public Cow(byte age) {
        super(age);
    }

    @Override
    public void sound() {
        System.out.println("Booo");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "age=" + age +
                '}';
    }
}

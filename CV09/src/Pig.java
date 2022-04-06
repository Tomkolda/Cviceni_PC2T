public class Pig extends AbstractAnimal{
    public Pig(byte age) {
        super(age);
    }

    @Override
    public void sound() {
        System.out.println("Chroch");
    }

    @Override
    public String toString() {
        return "Pig{" +
                "age=" + age +
                '}';
    }
}

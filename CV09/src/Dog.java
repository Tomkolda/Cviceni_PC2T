public class Dog extends AbstractAnimal{
    public Dog(byte age) {
        super(age);
    }

    @Override
    public void sound() {
        System.out.println("Haf");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

}

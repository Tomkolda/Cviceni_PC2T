public class Cat extends AbstractAnimal {
    public Cat(byte age) {
        super(age);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}

public abstract class AbstractAnimal {

    byte age;

    public AbstractAnimal(byte age) {
        this.age = age;
    }

    public abstract void sound();
}

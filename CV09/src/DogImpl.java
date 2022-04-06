import java.io.FileWriter;
import java.io.IOException;

public class DogImpl implements Animal{
    byte age;

    public DogImpl(byte age) {
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Haf");
    }

    @Override
    public void toFile() {
        try {
            FileWriter fw = new FileWriter("animals.txt");
            fw.write("Haf \n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "DogImpl{" +
                "age=" + age +
                '}';
    }
}

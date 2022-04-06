import java.io.FileWriter;
import java.io.IOException;

public class PigImpl implements Animal{
    byte age;

    public PigImpl(byte age) {
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Chroch");
    }

    @Override
    public void toFile() {
        try {
            FileWriter fw = new FileWriter("animals.txt");
            fw.write("Chroch \n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "PigImpl{" +
                "age=" + age +
                '}';
    }
}

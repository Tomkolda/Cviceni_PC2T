import java.io.FileWriter;
import java.io.IOException;

public class CowImpl implements Animal{
    byte age;

    public CowImpl(byte age) {
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Buu");
    }

    @Override
    public void toFile() {
        try {
            FileWriter fw = new FileWriter("animals.txt");
            fw.write("Buu \n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "CowImpl{" +
                "age=" + age +
                '}';
    }
}

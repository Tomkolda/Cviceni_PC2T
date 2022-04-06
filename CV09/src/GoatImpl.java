import java.io.FileWriter;
import java.io.IOException;

public class GoatImpl implements Animal{
    byte age;

    public GoatImpl(byte age) {
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Mee");
    }

    @Override
    public void toFile() {
        try {
            FileWriter fw = new FileWriter("animals.txt");
            fw.write("Mee \n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "GoatImpl{" +
                "age=" + age +
                '}';
    }
}

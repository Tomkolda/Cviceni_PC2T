import java.io.FileWriter;
import java.io.IOException;

public class CatImpl implements Animal{
    byte age;

    public CatImpl(byte age) {
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void toFile() {
        try {
            FileWriter fw = new FileWriter("animals.txt");
            fw.write("Meow \n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "CatImpl{" +
                "age=" + age +
                '}';
    }
}

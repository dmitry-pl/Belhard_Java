import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main_serialization {
    private static final String exampleStr = "Строка для проверки";

    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("PW11\\files\\data.dat")))
        {
            oos.writeUTF(exampleStr);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("PW11\\files\\data.dat")))
        {
            System.out.println(ois.readUTF());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Output-Input operations";

        try (FileInputStream fin = new FileInputStream("PW10\\files\\test.txt")) {
            System.out.println("Размер файла: " + fin.available());
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer);

            for(byte b: buffer) {
                System.out.println((char) b);
            }
        } catch (IOException ex) {
            System.out.println("Файла не существует");
        }
        try (FileOutputStream fos = new FileOutputStream("PW10\\files\\test.txt")) {
            fos.write(text.getBytes(), 0, text.getBytes().length);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_NAME = "HomeWork9\\Task2_LibraryWithFiles\\data\\readers_data.dat";

    public static boolean saveReadersList(List<Reader> readers) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Записываем весь список читателей в файл
            objectOutputStream.writeObject(readers);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Список читателей успешно сохранен в файл: " + FILE_NAME);
            System.out.println("Сохранено читателей: " + readers.size());
            return true;

        } catch (IOException e) {
            System.err.println("Ошибка при сохранении списка читателей: " + e.getMessage());
            return false;
        }
    }

    public static List<Reader> restoreReadersList() {
        File file = new File(FILE_NAME);

        // Проверяем, существует ли файл
        if (!file.exists()) {
            System.out.println("Файл с данными читателей не найден. Будет создан новый список.");
            return new ArrayList<Reader>();
        }

        try {
            // Создаем потоки для чтения объектов
            FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Читаем список читателей из файла
            List<Reader> readers = (List<Reader>) objectInputStream.readObject();

            // Закрываем потоки
            objectInputStream.close();
            fileInputStream.close();

            System.out.println("Список читателей успешно восстановлен из файла: " + FILE_NAME);
            System.out.println("Загружено читателей: " + readers.size());
            return readers;

        } catch (IOException e) {
            System.err.println("Ошибка при чтении списка читателей: " + e.getMessage());
            return new ArrayList<Reader>();
        } catch (ClassNotFoundException e) {
            System.err.println("Ошибка: класс не найден при чтении файла: " + e.getMessage());
            return new ArrayList<Reader>();
        }
    }
}
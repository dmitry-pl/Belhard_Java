import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Reader> readers; // Список читателей вместо массива

    public Library() {
        this.readers = FileUtil.restoreReadersList();
    }

    // Добавление читателя
    public void addReader(Reader reader) {
        readers.add(reader);
        System.out.println("Читатель " + reader.getFIO() + " добавлен в библиотеку");
    }

    // Удаление читателя
    public void removeReader(int libraryCardNumber) {
        Reader readerToRemove = null;
        for (Reader reader : readers) {
            if (reader.getLibraryCardNumber() == libraryCardNumber) {
                readerToRemove = reader;
                break;
            }
        }

        if (readerToRemove != null) {
            readers.remove(readerToRemove);
            System.out.println("Читатель с билетом " + libraryCardNumber + " удален из библиотеки");
        } else {
            System.out.println("Читатель с билетом " + libraryCardNumber + " не найден");
        }
    }

    // Поиск читателя по номеру билета
    public Reader findReader(int libraryCardNumber) {
        for (Reader reader : readers) {
            if (reader.getLibraryCardNumber() == libraryCardNumber) {
                return reader;
            }
        }
        return null;
    }

    // Вывод всех читателей
    public void printAllReaders() {
        System.out.println("\n=== ВСЕ ЧИТАТЕЛИ БИБЛИОТЕКИ ===");
        if (readers.isEmpty()) {
            System.out.println("В библиотеке нет читателей");
        } else {
            for (Reader reader : readers) {
                System.out.println("- " + reader.GetUserFullInfo());
            }
        }
        System.out.println("================================\n");
    }

    // Сохранение данных перед закрытием программы
    public void saveData() {
        boolean success = FileUtil.saveReadersList(readers);
        if (success) {
            System.out.println("Данные библиотеки успешно сохранены");
        } else {
            System.out.println("Не удалось сохранить данные библиотеки");
        }
    }

    // Получение списка всех читателей
    public List<Reader> getReaders() {
        return readers;
    }
}
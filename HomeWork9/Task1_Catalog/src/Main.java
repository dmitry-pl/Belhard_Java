import java.io.*;

public class Main {

    public static void main(String[] args) {
        String folderPath = "HomeWork9\\Task1_Catalog\\files";
        String outputFile = "result.txt";

        try {
            combineFiles(folderPath, outputFile);
            System.out.println("\nСодержимое файла " + outputFile + ":");
            System.out.println("----------------------------------------");
            printFileContents(outputFile);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода: " + e.getMessage());
        }
    }

    public static void combineFiles(String folderPath, String outputFile) throws IOException {
        File directory = new File(folderPath);

        if (!directory.exists()) {
            throw new IOException("Папка '" + folderPath + "' не существует!");
        }
        if (!directory.isDirectory()) {
            throw new IOException("'" + folderPath + "' не является папкой!");
        }
        if (!directory.canRead()) {
            throw new IOException("Нет прав на чтение папки '" + folderPath + "'!");
        }

        File[] allFiles = directory.listFiles();

        if (allFiles == null || allFiles.length == 0) {
            System.out.println("Папка '" + folderPath + "' пуста!");
            return;
        }

        try (BufferedWriter outputWriter = new BufferedWriter(new FileWriter(outputFile))) {
            int textFileCount = 0;

            for (File currentFile : allFiles) {
                if (currentFile.isDirectory()) {
                    continue; // это папка, пропускаем
                }

                String fileName = currentFile.getName();
                if (!fileName.toLowerCase().endsWith(".txt")) {
                    continue; // не текстовый файл, пропускаем
                }

                textFileCount++;
                System.out.println("Читаем файл " + textFileCount + ": " + fileName);

                try (BufferedReader fileReader = new BufferedReader(new FileReader(currentFile))) {
                    String currentLine;
                    while ((currentLine = fileReader.readLine()) != null) {
                        outputWriter.write(currentLine);
                        outputWriter.newLine();
                    }
                    //outputWriter.newLine();
                }
            }

            if (textFileCount == 0) {
                System.out.println("В папке не найдено текстовых файлов (.txt)");
            } else {
                System.out.println("Успешно объединено " + textFileCount + " файлов в " + outputFile);
            }

        }
    }

    public static void printFileContents(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int counter = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println(counter + ". " + line);
                counter++;
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл " + filename + " не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}

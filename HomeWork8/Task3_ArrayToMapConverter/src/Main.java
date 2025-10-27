import java.util.HashMap;
import java.util.Map;
/*
Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
где K — значение из массива, а Integer — количество вхождений в массив.
То есть сигнатура метода выглядит так:
<K> Map<K, Integer> arrayToMap(K[] ks);
То есть, если массив похож на {1,2,4,4}, то map будет выглядеть как {1:1, 2:1, 4:2}
 */
public class Main {
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> frequencyMap = new HashMap<>();

        for (K element : ks) {
            int currentCount = frequencyMap.getOrDefault(element, 0);
            frequencyMap.put(element, currentCount + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        demonstrateWithIntegers();
        demonstrateWithStrings();
        demonstrateWithEmptyArray();
    }

    private static void demonstrateWithIntegers() {
        System.out.println("=== Демонстрация с Integer ===");
        Integer[] numbers = {1, 2, 4, 4, 2, 3, 1, 4, 5};
        Map<Integer, Integer> result = arrayToMap(numbers);

        System.out.println("Входной массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Результат: " + result);
        System.out.println();
    }

    private static void demonstrateWithStrings() {
        System.out.println("=== Демонстрация с String ===");
        String[] words = {"hello", "world", "hello", "java", "world", "hello"};
        Map<String, Integer> result = arrayToMap(words);

        System.out.println("Входной массив: " + java.util.Arrays.toString(words));
        System.out.println("Результат: " + result);
        System.out.println();
    }

    private static void demonstrateWithEmptyArray() {
        System.out.println("=== Демонстрация с пустым массивом ===");
        String[] emptyArray = {};
        Map<String, Integer> result = arrayToMap(emptyArray);

        System.out.println("Входной массив: " + java.util.Arrays.toString(emptyArray));
        System.out.println("Результат: " + result);
        System.out.println();
    }
}
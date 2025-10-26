import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Product> products = createSampleProducts();

        System.out.println("МАГАЗИН ТОВАРОВ");
        System.out.println("=" .repeat(50));

        printEntrySetEnhanced(products);
        printKeySetEnhanced(products);
        printValuesEnhanced(products);
    }

    private static HashMap<String, Product> createSampleProducts() {
        HashMap<String, Product> products = new HashMap<>();

        products.put("P001", new Product("Ноутбук Lenovo", 50000, "Электроника"));
        products.put("P002", new Product("iPhone 15", 30000, "Электроника"));
        products.put("P003", new Product("Кофеварка Bosch", 15000, "Бытовая техника"));
        products.put("P004", new Product("Война и мир", 500, "Книги"));
        products.put("P005", new Product("Наушники Sony", 4000, "Электроника"));
        products.put("P006", new Product("Футболка", 1500, "Одежда"));

        return products;
    }

    public static void printEntrySetEnhanced(HashMap<String, Product> products) {
        System.out.println("\nВСЕ ТОВАРЫ (пары код-товар):");
        System.out.println("-".repeat(50));

        for (Map.Entry<String, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            System.out.printf("Код: %s | %-20s | %7.2f руб. | %s%n",
                    entry.getKey(),
                    product.getName(),
                    product.getPrice(),
                    product.getCategory());
        }
    }

    public static void printKeySetEnhanced(HashMap<String, Product> products) {
        System.out.println("\nКОДЫ ТОВАРОВ:");
        System.out.println("-".repeat(50));

        int counter = 1;
        for (String key : products.keySet()) {
            System.out.println(counter + ". " + key);
            counter++;
        }
    }

    public static void printValuesEnhanced(HashMap<String, Product> products) {
        System.out.println("\nИНФОРМАЦИЯ О ТОВАРАХ:");
        System.out.println("-".repeat(50));

        int counter = 1;
        for (Product product : products.values()) {
            System.out.printf("%d. %-20s | %7.2f руб. | %s%n",
                    counter,
                    product.getName(),
                    product.getPrice(),
                    product.getCategory());
            counter++;
        }
    }
}
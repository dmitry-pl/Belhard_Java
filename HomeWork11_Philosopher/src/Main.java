public class Main {
    private static final int PHILOSOPHERS_COUNT = 5;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== РЕШЕНИЕ ЗАДАЧИ ФИЛОСОФОВ ===");
        System.out.println("Количество философов: " + PHILOSOPHERS_COUNT);
        System.out.println("Запуск на 20 секунд...\n");

        Fork[] forks = new Fork[PHILOSOPHERS_COUNT];
        for (int i = 0; i < PHILOSOPHERS_COUNT; i++) {
            forks[i] = new Fork(i);
        }

        Philosopher[] philosophers = new Philosopher[PHILOSOPHERS_COUNT];
        for (int i = 0; i < PHILOSOPHERS_COUNT; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % PHILOSOPHERS_COUNT];
            philosophers[i] = new Philosopher(i, leftFork, rightFork);
        }

        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }

        Thread.sleep(20000);

        for (Philosopher philosopher : philosophers) {
            philosopher.interrupt();
        }

        for (Philosopher philosopher : philosophers) {
            try {
                philosopher.join(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        printStatistics(philosophers);
    }

    private static void printStatistics(Philosopher[] philosophers) {
        System.out.println("\n=== СТАТИСТИКА ===");
        int totalEats = 0;
        for (Philosopher philosopher : philosophers) {
            int eats = philosopher.getEatCount();
            totalEats += eats;
            System.out.println(philosopher.getName() + " поел " + eats + " раз");
        }
        System.out.println("Всего приемов пищи: " + totalEats);
        System.out.println("Среднее на философа: " + (totalEats / (double)philosophers.length));
    }
}
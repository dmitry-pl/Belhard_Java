public class Philosopher extends Thread {
    private final int id;
    private final Fork leftFork;
    private final Fork rightFork;
    private int eatCount = 0;

    public Philosopher(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        setName("Едящий мыслитель - " + id);
    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                think();
                eat();
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " не дали похавать");
        }
    }

    private void think() throws InterruptedException {
        System.out.println(getName() + " размышляет...ага, о птичках...");
        Thread.sleep((long)(Math.random() * 2000) + 1000); // 1-3 секунды
    }

    private void eat() throws InterruptedException {
        if (takeForks()) {
            try {
                System.out.println("✓ " + getName() + " вкушает с " + leftFork + " и " + rightFork +
                        " (раз: " + (eatCount + 1) + ")");
                eatCount++;
                Thread.sleep((long)(Math.random() * 1500) + 500); // 0.5-2 секунды
                System.out.println("✓ " + getName() + " закончил есть");
            } finally {
                putDownForks();
            }
        }
    }

    private boolean takeForks() throws InterruptedException {
        while (!Thread.currentThread().isInterrupted()) {
            if (id == 4) {
                if (rightFork.take()) {
                    System.out.println(getName() + " взял " + rightFork);

                    if (leftFork.take()) {
                        System.out.println(getName() + " взял " + leftFork);
                        return true;
                    } else {
                        rightFork.putDown();
                    }
                }
            } else {
                if (leftFork.take()) {
                    System.out.println(getName() + " взял " + leftFork);

                    if (rightFork.take()) {
                        System.out.println(getName() + " взял " + rightFork);
                        return true;
                    } else {
                        leftFork.putDown();
                    }
                }
            }
            Thread.sleep(100 + (long)(Math.random() * 200));
        }
        return false;
    }

    private void putDownForks() {
        if (id == 4) {
            leftFork.putDown();
            rightFork.putDown();
        } else {
            rightFork.putDown();
            leftFork.putDown();
        }
        System.out.println(getName() + " положил вилки");
    }

    public int getEatCount() {
        return eatCount;
    }
}
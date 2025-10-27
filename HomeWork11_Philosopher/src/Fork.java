public class Fork {
    private final int id;
    private boolean isTaken;

    public Fork(int id) {
        this.id = id;
        this.isTaken = false;
    }

    public synchronized boolean take() {
        if (!isTaken) {
            isTaken = true;
            return true;
        }
        return false;
    }

    public synchronized void putDown() {
        isTaken = false;
        notifyAll();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Видэлец намбер - " + id;
    }
}
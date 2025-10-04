public class Drum implements Instrument{
    private int numberOfPlates;

    public Drum(int numberOfPlates) {
        this.numberOfPlates = numberOfPlates;
    }
    @Override
    public void play() {
        System.out.println("Играют барабаны, количество тарелок - " + numberOfPlates + " тональность - " + KEY);
    }
}

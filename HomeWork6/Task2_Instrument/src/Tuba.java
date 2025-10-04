public class Tuba implements Instrument{
    private int numberOfHands;

    public Tuba (int numberOfHands) {
        this.numberOfHands = numberOfHands;
    }
    @Override
    public void play() {
        System.out.println("Играет туба, количество рук - " + numberOfHands + " тональность - " + KEY);
    }
}

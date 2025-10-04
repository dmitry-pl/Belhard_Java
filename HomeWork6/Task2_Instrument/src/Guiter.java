public class Guiter implements Instrument{
    private int numberOfStrings;

    public Guiter(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play() {
        System.out.println("Играет гитара, количество струн - " + numberOfStrings + " тональность - " + KEY);
    }
}

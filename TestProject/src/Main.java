public class Main {
    public static void main(String[] args) {
        int birthDate = 2013;
        int minimumAge = 18;
        int curYear = 2025;

        if ((curYear - birthDate) >= minimumAge){
            System.out.println("Ok");
        }
        else {
            System.out.println("Too young");
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>();

        people.add("Pupkin");
        people.add("Vaskin");
        System.out.println(people.toString());
        people.add(1,"Seredinkin");
        System.out.println(people.toString());
        System.out.println(people.indexOf("Pupkin"));
        System.out.println(people.indexOf("Vaskin"));
        System.out.println("Size - " + people.size());
        people.add("Vaskin");
        System.out.println(people);
        System.out.println(people.indexOf("Vaskin"));

    }
}
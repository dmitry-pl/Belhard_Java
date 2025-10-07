import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        System.out.println("\r r");
        System.out.println("\f f");

        int a = 4;
        double b = 4.34;
        System.out.printf("a = %d, b = %f%n", a, b);

        StringBuilder sb = new StringBuilder("world");
        sb.setCharAt(0, 'W');
        System.out.println(sb.toString());

        sb.append(" fucking world").append("!!! ").append(a).append(a + b);
        System.out.println(sb);

        String str = "Ехал Грека через реку";
        String[] strArr = str.split(" ");
        for (String w: strArr) {
            System.out.println(w);
        }

        StringTokenizer tokenizer = new StringTokenizer("Видит Грека в реке рак", " ");
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}

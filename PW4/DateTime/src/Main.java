import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Date time1 = new Date();
        Thread.sleep(2000);
        Date time2 = new Date();

        System.out.println(time1.before(time2));
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SS dd.MM.yyyy");
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(dateFormat.format(time1));
        System.out.println(dateFormat.format(time2));
    }
}
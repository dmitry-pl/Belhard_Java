public class SenderEmail extends Sender{

    @Override
    public boolean send(String to, String msg) {
        boolean isTrue = false;
        if(!to.isEmpty() && to.endsWith("@gmail.com")){
            System.out.println(toString(to, msg) + " по почте");
            isTrue = true;
        }
        if(!isTrue) {
            System.out.println("Указан некорректный адрес отправления - " + to);
        }
        return isTrue;
    }
}

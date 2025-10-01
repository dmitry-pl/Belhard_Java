public class SenderSms extends Sender{

    @Override
    public boolean send(String to, String msg) {
        boolean isTrue = false;
        if(!to.isEmpty() && to.startsWith("+")){
            System.out.println(toString(to, msg) + " по Смс");
            isTrue = true;
        }
        if(!isTrue) {
            System.out.println("Указан некорректный адрес отправления - " + to);
        }
        return isTrue;
    }
}

public class SenderSms extends Sender{

    SenderSms(String to, String msg) {
        super(to, msg);
    }

    @Override
    public boolean send(String to, String msg) {
        boolean isTrue = false;
        if(to.equals("+375") && to.charAt(0) == '+'){
            System.out.println(toString() + " по Смс");
            isTrue = true;
        }
        System.out.println(toString() + " по Смс");
        return isTrue;
    }
}

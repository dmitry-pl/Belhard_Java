public class SenderTelegram extends Sender{
    SenderTelegram(String to, String msg) {
        super(to, msg);
    }

    @Override
    public boolean send(String to, String msg) {
        boolean isTrue = false;
        if(to.charAt(0) == '@'){
            System.out.println(toString() + " по телеграмму");
            isTrue = true;
        }
        return isTrue;
    }
}

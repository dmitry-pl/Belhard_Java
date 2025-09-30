public class SenderEmail extends Sender{
    SenderEmail(String to, String msg) {
        super(to, msg);
    }

    @Override
    public boolean send(String to, String msg) {
        boolean isTrue = false;
        if(to.equals("@gmail.com")){
            System.out.println(toString() + " по почте");
            isTrue = true;
        }
        return isTrue;
    }
}

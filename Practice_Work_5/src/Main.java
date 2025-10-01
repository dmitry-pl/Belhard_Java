public class Main {
    public static void main(String[] args) {
        String to = "+375290875645";
        String msg = "Привет. как дела?";

        Sender senderSms = new SenderSms();
        Sender senderEmail = new SenderEmail();
        Sender senderTelegram = new SenderTelegram();

        Sender[] senders = {senderSms, senderEmail, senderTelegram};

        for(Sender sender:senders) {
            sender.send(to, msg);
        }
    }
}
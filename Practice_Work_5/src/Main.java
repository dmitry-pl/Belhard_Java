public class Main {
    public static void main(String[] args) {
        String to = "+375290875645";
        String msg = "Привет. как дела?";

        Sender senderSms = new SenderSms(to, msg);
        Sender senderEmail = new SenderEmail(to, msg);
        Sender senderTelegram = new SenderTelegram(to, msg);

        Sender[] senders = {senderSms, senderEmail, senderTelegram};

        for(Sender sender:senders) {
            sender.send(to, msg);
        }
    }
}
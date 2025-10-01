abstract class Sender {

    public abstract boolean send(String to, String msg);


    public String toString(String to, String msg) {
        return "Сообщение " + msg + " было отправлено " + to;
    }
}

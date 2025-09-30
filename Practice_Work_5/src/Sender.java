abstract class Sender {
    private String to;
    private String msg;

    Sender(String to, String msg) {
        this.to = to;
        this.msg = msg;
    }

    public abstract boolean send(String to, String msg);

    @Override
    public String toString() {
        return "Сообщение " + msg + " было отправлено " + to;
    }
}

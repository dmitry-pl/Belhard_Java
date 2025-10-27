import java.io.Serializable;

public class Book implements Serializable {
    // Добавляем serialVersionUID для контроля версий
    private static final long serialVersionUID = 1L;

    private String name;
    private String authorName;
    private String text;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }

    public Book(String name, String authorName, String text) {
        this(name, authorName);
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return name + " (" + authorName + ")";
    }
}
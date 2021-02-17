import java.util.Calendar;
import java.util.Objects;

public class Reminder implements Comparable<Reminder>{

    private static int COUNT = 1;

    private Calendar expired;
    private String text;
    private boolean important;
    private boolean popped;

    public Reminder() {
        this.expired = FactoryUtils.getCalendar();
        this.text = "Reminder number - " + COUNT++;
        this.important = FactoryUtils.getBoolean();
        this.popped = false;
    }

    public Reminder(Calendar expired, String text, boolean important, boolean popped) {
        this.expired = expired;
        this.text = text;
        this.important = important;
        this.popped = popped;
    }

    public Calendar getExpired() {
        return expired;
    }

    public void setExpired(Calendar expired) {
        this.expired = expired;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isPopped() {
        return popped;
    }

    public void setPopped(boolean popped) {
        this.popped = popped;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "expired=" + DateUtils.beautifyDate(expired) +
                ", text='" + text + '\'' +
                ", important=" + important +
                ", popped=" + popped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reminder)) return false;
        Reminder reminder = (Reminder) o;
        return important == reminder.important && popped == reminder.popped && Objects.equals(expired, reminder.expired) && Objects.equals(text, reminder.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expired, text, important, popped);
    }

    @Override
    public int compareTo(Reminder other) {
        return this.expired.compareTo(other.expired);
    }

}

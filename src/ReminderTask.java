import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ReminderTask implements Runnable {

    private Set<Reminder> reminders;
    private ImportantReminderTask important;
    private Thread t1;

    public ReminderTask(Set<Reminder> reminders) {
        this.reminders = reminders;
        this.important = new ImportantReminderTask(null);
        this.t1 = new Thread(important);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Hi.............");
            if (reminders.size() > 0) {
                for (Reminder reminder : reminders) {
                    //System.out.println(reminder.getExpired().getTime());
                important = new ImportantReminderTask(reminder);
                if (DateUtils.isNow(reminder.getExpired())) {
                    System.out.println("Hello... you have a reminder!\n" + reminder.getText());
                    if (reminder.isImportant()) {
                        t1.start();
                    }
                }
                }
            }
        }

    }
}

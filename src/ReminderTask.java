import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

public class ReminderTask implements Runnable {

    private Set<Reminder> reminders;

    public ReminderTask(Set<Reminder> reminders) {
        this.reminders = reminders;
    }

    public void startImportantThread(Reminder reminder) {
        new Thread(new ImportantReminderTask(reminder)).start();
    }

    @Override
    public void run() {
        while (true) {
            for (Reminder reminder : reminders) {
                if ((!reminder.isImportant()) && (!reminder.isPopped()) && (reminder.getExpired().before(Calendar.getInstance()))) {
                    System.out.println("YOU HAVE A REMINDER !\nIt was set to: " + DateUtils.beautifyDate(reminder.getExpired()) + " and the message is: " + reminder.getText());
                    reminder.setPopped(true);
                } else if ((reminder.isImportant()) && (!reminder.isPopped()) && (reminder.getExpired().before(Calendar.getInstance()))) {
                    startImportantThread(reminder);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

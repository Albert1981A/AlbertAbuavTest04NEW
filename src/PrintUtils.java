import java.util.List;

public class PrintUtils {

    public static void print(List<Reminder> reminders) {
        for (Reminder reminder: reminders) {
            System.out.println(reminder);
        }
    }
}

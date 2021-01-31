import java.util.*;

public class ReminderSystem {

    private static Scanner in = new Scanner(System.in);

    private Set<Reminder> reminders;
    private Thread notify;
    private ReminderTask reminderTask;

    public ReminderSystem() {
        this.reminders = new HashSet<>();
        this.reminderTask = new ReminderTask(reminders);
        this.notify = new Thread(reminderTask);
        notify.start();
        flow();
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);

    }

    public void printAllSorted() {
        List<Reminder> list = new ArrayList<>(reminders);
        Collections.sort(list);
        PrintUtils.print(list);
    }

    public void printGoodBye() {
        System.out.println("Thank you and good bye...");
    }

    public void showMenu() {
        System.out.println("Welcome to your reminder system \nPlease choose your action:");
        System.out.println("1 - Add a new reminder");
        System.out.println("2 - Show all sorted by date");
        System.out.println("3 - Exit");
    }

    public void flow() {
        showMenu();
        int action = in.nextInt();
        while (action != 3){
            switch(action) {
                case 1: {
                    addReminder(new Reminder());
                    break;
                }
                case 2: {
                    printAllSorted();
                    break;
                }
                default:
                    break;
            }
            showMenu();
            action = in.nextInt();
        }
        printGoodBye();
        in.close();
    }
}

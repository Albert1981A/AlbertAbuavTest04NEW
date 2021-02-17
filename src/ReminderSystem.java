import java.util.*;

public class ReminderSystem {

    private static Scanner in = new Scanner(System.in);

    private Set<Reminder> reminders;
    private ReminderTask reminderTask;

    public ReminderSystem() {
        this.reminders = new HashSet<>();
        this.reminderTask = new ReminderTask(reminders);
        new Thread(reminderTask).start();
    }

    public void showMenu() {
        System.out.println("Please choose your action:");
        System.out.println("1 - Add a new reminder");
        System.out.println("2 - Show all reminders sorted by date");
        System.out.println("3 - Exit");
    }

    public void startReminderSystem() {
        System.out.println("Welcome to your reminder system");
        showMenu();
        int action = in.nextInt();
        while (action != 3){
            switch(action) {
                case 1: {
                    addReminder(new Reminder());
                    break;
                }
                case 2: {
                    getReminders().forEach(System.out::println);
                    break;
                }
                default:
                    System.out.println("INVALID INPUT! . . . Please insert: 1, 2, or 3");
                    System.out.println();
                    break;
            }
            showMenu();
            action = in.nextInt();
        }
        printGoodBye();
        in.close();
        System.exit(0);
    }

    public void addReminder(Reminder reminder) {
        reminders.add(reminder);

    }

    public List<Reminder> getReminders() {
        List<Reminder> list = new ArrayList<>(reminders);
        Collections.sort(list);
        return list;
    }

    public void printGoodBye() {
        System.out.println("Thank you and good bye...");
    }




}

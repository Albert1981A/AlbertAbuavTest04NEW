public class ImportantReminderTask implements Runnable{

    private Reminder reminder;

    public ImportantReminderTask(Reminder reminder) {
        this.reminder = reminder;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Hello... you have a reminder!\nIt is an important Task: " + reminder.getText() + "\nMassage number 2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Hello... you have a reminder!\nIt is an important Task: " + reminder.getText() + "\nMassage number 3");

    }
}

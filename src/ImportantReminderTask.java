
public class ImportantReminderTask implements Runnable{

    private static int COUNT = 0;
    private Reminder reminder;

    public ImportantReminderTask(Reminder reminder) {
        this.reminder = reminder;
    }

    @Override
    public void run() {
        while(COUNT < 3) {
            System.out.println("YOU HAVE AN \"IMPORTANT\" REMINDER !\nIt was set to: " + DateUtils.beautifyDate(reminder.getExpired()) + " - this is massage number " + ++COUNT + " and the message is: " + reminder.getText());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

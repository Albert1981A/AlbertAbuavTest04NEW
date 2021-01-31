import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtils {

    private static Calendar calendar = Calendar.getInstance();

    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public static String date(Calendar calendar) {
        return format.format(calendar.getTime());
    }

    /*
    public static boolean isNow(Calendar c) {
        return c.getTime().equals(calendar.getTime());
    }
    */

    public static boolean isNow(Calendar c) {
        System.out.println("isNou = "+c.getTime());
        return ((c.getTime().getYear() == calendar.getTime().getYear()) &&
                (c.getTime().getMonth() == calendar.getTime().getMonth()) &&
                (c.getTime().getDay() == calendar.getTime().getDay()) &&
                (c.getTime().getHours() == calendar.getTime().getHours()) &&
                (c.getTime().getMinutes() == calendar.getTime().getMinutes()));
    }

}

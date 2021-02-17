import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {

    private static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

    public static String beautifyDate(Calendar calendar) {
        return format.format(calendar.getTime());
    }
}

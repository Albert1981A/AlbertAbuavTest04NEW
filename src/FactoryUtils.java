import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FactoryUtils {

    public static boolean bool(){
        return ((int)(Math.random()*2) == 0);
    }

    public static Calendar calendar() {
        Calendar expiration = Calendar.getInstance();
        expiration.set(Calendar.DAY_OF_MONTH, 30);
        expiration.set(Calendar.MONTH, 1-1);
        expiration.set(Calendar.YEAR, 2021);
        expiration.set(Calendar.HOUR_OF_DAY, 23);
        expiration.set(Calendar.MINUTE, 53);//(int)(Math.random()*60));
        return expiration;
    }
}

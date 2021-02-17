import java.util.Calendar;
import java.util.Random;

public class FactoryUtils {

    public static boolean getBoolean(){
        // potion 1: return ((int)(Math.random()*2) == 0);
        Random random = new Random();
        return random.nextBoolean();
    }

    public static Calendar getCalendar() {
        Calendar expiration = Calendar.getInstance();
        expiration.getTime();
        expiration.add(Calendar.MINUTE, (int)(Math.random()*21)-10);
        return expiration;
    }
}

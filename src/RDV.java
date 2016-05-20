/**
 * Created by Guillaume on 20/05/2016.
 */
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Calendar;

public class RDV extends Task {

    protected GregorianCalendar date;

    public RDV(String label, int day, int month, int year, int hours, int minutes)
    {
        super(label);
        date = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        date.set(year, month, day, hours, minutes, 0);
    }
}

package todolist.special_task; /**
 * Created by Guillaume on 20/05/2016.
 */
import todolist.Task;

import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.Calendar;

public class RDV extends Task {

    protected GregorianCalendar date;

    /**
     *
     * RDV Constructor
     *
     * @param label
     * @param day
     * @param month
     * @param year
     * @param hours
     * @param minutes
     */
    public RDV(String label, int day, int month, int year, int hours, int minutes)
    {
        super(label);
        date = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        date.set(year, month, day, hours, minutes, 0);
    }

    @Override
    public String toString()
    {
        String done;

        if(isDone())
            done = "(effectuée)";
        else
            done = "(à faire)";
        return "Rendez-vous \"" + getLabel() + "\" le " +
                date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" +
                date.get(Calendar.YEAR) + " à " + date.get(Calendar.HOUR) + ":" +
                date.get(Calendar.MINUTE) + " " + done;
    }

    /**
     *
     * Check if a RDV is out of date.
     *
     * @return <ul>
     *     <li>true: RDV out of date.</li>
     *     <li>false: RDV in date.</li>
     * </ul>
     */
    public Boolean isLate()
    {
        GregorianCalendar now = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris"));
        if(date.compareTo(now) == -1)
            return true;
        else
            return false;
    }
}

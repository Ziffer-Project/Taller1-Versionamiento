import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by david on 18/03/15.
 */
public class Forum {
    private String name;
    private Date dateCreated;
    private String category;

    public Forum(String name, String category){
        this.name = name;
        this.category = category;
        dateCreated = new Date();
        dateCreated.setTime(GregorianCalendar.getInstance().getTimeInMillis());
    }
}

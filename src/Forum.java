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
    
    public void setName(String name){
        this.name = name;
    }

    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return  category;
    }

    public Date getDateCreated(){
        return dateCreated;
    }
}

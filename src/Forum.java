import java.util.*;

public class Forum {
	
    private String name;
    private Date dateCreated;
    private String category;
    private List<Post> posts = new ArrayList<Post>();
    
    public Forum(){}

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
    
    public void setPosts(List<Post> posts){
		this.posts = posts;
	}
	
	public List<Post> getPosts(){
		return posts;
	}
}

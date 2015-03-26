import java.util.*;

public class Admin extends User {

	private int level;
	private double rating;
	private List<Forum> forums = new ArrayList<Forum>();

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}
	
	public void setForums(List<Forum> forums){
		this.forums = forums;
	}
	
	public List<Forum> getForums(){
		return forums;
	}
}

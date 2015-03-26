import java.util.*;

public class Regular extends User{

	private int postViews;
	private int strikesNumber;
	private int starsNumber;
	private List<Post> posts = new ArrayList<Post>();
	
	public int getPostViews() {
		return postViews;
	}
	public void setPostViews(int postViews) {
		this.postViews = postViews;
	}
	public int getStrikesNumber() {
		return strikesNumber;
	}
	public void setStrikesNumber(int strikesNumber) {
		this.strikesNumber = strikesNumber;
	}
	public int getStarsNumber() {
		return starsNumber;
	}
	public void setStarsNumber(int starsNumber) {
		this.starsNumber = starsNumber;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

}

package accessmodifiers;

public class SocialMedia {

	 String post="";
	
	String photos="";
	
	SocialMedia() {
		
	}
	
	public SocialMedia(String post, String photos) {
		super();
		this.post = post;
		this.photos = photos;
	}

	public void postPublicly(){
		
	}
	
	void postToGroup(){
		System.out.println(post);
	}
	
	private void postOnlyYouCansee(){
		System.out.println(post);
	}
}

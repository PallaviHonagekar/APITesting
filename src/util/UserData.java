package util;

public class UserData {
	private int id;
	private String first_name;
	private String last_name;
	private String avatar;
	
	public int getId() {
		return this.id;
	}
	
	public String getFirst_name() {
		return this.first_name;
	}
	
	public String getLast_name() {
		return this.last_name;
	}
	
	public String getAvatar() {
		return this.avatar;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFirst_name(String firstName) {
		this.first_name = firstName;
	}
	
	public void setLast_name(String lastName) {
		this.last_name = lastName;
	}
	
	public void setAvatar(String profilePicture) {
		this.avatar = profilePicture;
	}
}

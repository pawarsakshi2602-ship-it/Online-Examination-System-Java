
public class User {
	
	private String username = "admin";
	private String password = "1234";
	
	public boolean login(String u, String p) {
		return u.equals(username) && p.equals(password);
	}
	
	public void updateProfile(String newUsername, String newPassword) {
		username = newUsername;
		password = newPassword;
	}
	public String getUsername() {
		return username;
	}

}

package bean;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
	private String username;
	private String password;
	private List<String> roles;
	
	public UserAccount() {
		// TODO Auto-generated constructor stub
	}

	public UserAccount(String username, String password, String... roles) {
		super();
		this.username = username;
		this.password = password;
		this.roles = new ArrayList<String>();
		if(roles != null) {
			for(String str : roles) 
				this.roles.add(str);		
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}

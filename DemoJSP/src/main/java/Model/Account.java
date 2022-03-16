package Model;

public class Account {
	private String username;
	private String password;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		final Account acc = (Account)obj;
		if(this.username.equals(acc.username) && this.password.equals(acc.password))
			return true;
		return false;
	}
	
	public boolean checkAccount() {
		if(this.username.equals("admin") && this.password.equals("admin"))
			return true;
		else
			return false;
	}
}

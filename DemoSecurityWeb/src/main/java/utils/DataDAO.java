package utils;

import java.util.HashMap;
import java.util.Map;

import bean.UserAccount;
import config.SecurityConfig;

public class DataDAO {
	private static final Map<String, UserAccount> mapUsers = new HashMap<String, UserAccount>();
	
	static {
		
	}
	
	public static void initUsers() {
		UserAccount emp = new UserAccount("employee1", "123", SecurityConfig.ROLE_EMPLOYEE);
		UserAccount mng = new UserAccount("manager1", "123", SecurityConfig.ROLE_EMPLOYEE, SecurityConfig.ROLE_MANAGER);

		mapUsers.put(emp.getUsername(), emp);
		mapUsers.put(mng.getUsername(), mng);
	}
	
	public static UserAccount findUser(String userName, String password) {
		UserAccount u = mapUsers.get(userName);
		if (u != null && u.getPassword().equals(password)) {
			return u;
		}
		return null;
	}
}

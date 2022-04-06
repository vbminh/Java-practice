package Model.BO;

import Model.Bean.Account;
import Model.DAO.AccountDAO;

public class AccountBO {
	private AccountDAO accountDAO;
	
	public AccountBO() {
		accountDAO = new AccountDAO();
	}
	
	public boolean checkLogin(String username, String password) {
		if(username == null)
			return false;
		if(password == null)
			return false;
		boolean result = accountDAO.checkLogin(username, password);
		return result;
	}
	
	public Account getAccount(String username) {
		if(username == null)
			return null;
		Account account = accountDAO.getAccount(username);
		return account;
	}
	
}

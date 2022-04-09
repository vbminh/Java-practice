package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Bean.Account;

public class AccountDAO {
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";

	    String dbName = "demo";
	    String userName = "root";
	    String password = "rop12345678";
		return getMySQLConnection(hostName, dbName, userName, password);
	}
	
	public static Connection getMySQLConnection(String hostName, String dbName,
			String userName, String password) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String connURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		
		Connection conn = DriverManager.getConnection(connURL,userName,password);
		return conn;
	}
	
	public boolean checkLogin(String username, String password) {
		try {
			Connection conn = getMySQLConnection();
			Statement statement = conn.createStatement();
			
			String sql = "Select * from account";
			
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
					rs.close();
					return true;	
				}
			}
			rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public Account getAccount(String username) {
		Account account = null;
		
		try {
			Connection conn = getMySQLConnection();
			Statement statement = conn.createStatement();
			
			String sql = "Select * from account where Username =\'" + username +"\'";
			
			ResultSet rs = statement.executeQuery(sql);
			
			if(rs.next()) {
				account = new Account();
				account.setUsername(rs.getString(1));
				account.setPassword(rs.getString(2));
				account.setName(rs.getString(3));
				account.setAge(rs.getInt(4));
				account.setAddress(rs.getString(5));
				account.setPhoneNumber(rs.getString(6));
			}
			rs.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return account;
	}
	
	public static void addAccount(Account account) {
		Connection conn;
		try {
			conn = getMySQLConnection();
			String sql = "Insert into account(Username,Password,HoTen,Tuoi,DiaChi,SDT)" + 
				" values(\"" + account.getUsername() + "\",\"" + account.getPassword() + 
				"\",\"" + account.getName() + "\"," + account.getAge() + ",\"" +
				account.getAddress() + "\",\"" + account.getPhoneNumber() + "\")";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute(sql);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void UpdateAccount(Account account) {
		Connection conn;
		try {	
			conn = getMySQLConnection();
			String sql = "Update account set HoTen=\"" + account.getName() + "\", Tuoi=" +
				account.getAge() + ", DiaChi=\"" + account.getAddress() + "\", SDT=\"" + 
				account.getPhoneNumber() + "\" where Username=\"" + account.getUsername() + "\"";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute(sql);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void DelAccount(Account account) {
		Connection conn;
		try {
			conn = getMySQLConnection();
			String sql = "Delete from account where Username=\"" + account.getUsername() + "\"";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute(sql);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

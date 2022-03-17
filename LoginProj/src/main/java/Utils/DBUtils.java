package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Account;
import Model.Person;

public class DBUtils {
	public static Account findUser(Connection conn, String username, String password)
		throws SQLException {
		String sql = "Select a.Username, a.Password from Account a"
				+ " where a.Username = ? and a.Password= ?";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, username);
		pstm.setString(2, password);
		ResultSet rs = pstm.executeQuery();
		
		if(rs.next()) {
			Account account = new Account();
			account.setUsername(username);
			account.setPassword(password);
			return account;
		}
		return null;
	}
	
	public static Account findUser(Connection conn, String username)
			throws SQLException {
			String sql = "Select a.Username, a.Password from Account a"
					+ " where a.Username = ?";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, username);
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
				String password = rs.getString("Password");
				Account account = new Account();
				account.setUsername(username);
				account.setPassword(password);
				return account;
			}
			return null;
		}
	
	public List<Person> queryPerson(Connection conn) throws SQLException {
		String sql = "Select a.ID, a.Name, a.Age from Person a";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Person> list = new ArrayList<Person>();
		
		if(rs.next()) {
			int id = rs.getInt("ID");
			String name = rs.getString("Name");
			int age = rs.getInt("Age");
			
			Person ps = new Person();
			ps.setId(id);
			ps.setName(name);
			ps.setAge(age);
			list.add(ps);
		}
		return list;
	}
	
	public static Person findPerson(Connection conn, int id) throws SQLException{
		String sql = "Select a.ID, a.Name, a.Age from Person a Where a.ID=?";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, id);
		
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			String name = rs.getString("Name");
			int age = rs.getInt("Age");
			Person ps = new Person(id, name, age);
			return ps;
		}
		return null;
	}
	
	
}

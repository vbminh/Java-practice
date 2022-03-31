package Model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.bean.Information;

public class InforDAO {
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		String hostName = "localhost";

	    String dbName = "phonenumberinfor";
	    String userName = "root";
	    String password = "rop12345678";
		return getMySQLConnection(hostName, dbName, userName, password);
	}
	
	public static Connection getMySQLConnection(String hostName, String dbName,
			String userName, String password) throws SQLException, ClassNotFoundException {
		String connURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		
		Connection conn = DriverManager.getConnection(connURL,userName,password);
		return conn;
	}
	
	public List<Information> getInformation(String maTB, String tenTB, String sDT, String diaChi) throws ClassNotFoundException, SQLException {
		Information info;
		List<Information> list = new ArrayList<Information>();
		
		Connection conn = getMySQLConnection();
		
		Statement statement = conn.createStatement();
		
		String sql = "Select * From phonenumberinfor Where MaThueBao = \'" + maTB + "\' and TenThueBao = \'"
				+ tenTB + "\' and SoDienThoai = \'" + sDT + "\' and DiaChi = \'" + diaChi + "\'";
		
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			info = new Information();
			info.setMaTB(rs.getString(1));
			info.setTenTB(rs.getString(2));
			info.setSDT(rs.getString(3));
			info.setDiaChi(rs.getString(4));
			list.add(info);	
		}
		conn.close();
		return list;
	}
}

package Model.BO;

import java.sql.SQLException;
import java.util.List;

import Model.bean.Information;
import Model.dao.InforDAO;

public class InforBO {
	private InforDAO inforDAO;
	
	public Information getInformation(String maTB, String tenTB, String sDT, String diaChi) throws ClassNotFoundException, SQLException {
		if(maTB.trim().equals("") && tenTB.trim().equals("") && sDT.trim().equals("") && diaChi.trim().equals(""))
			return null;
		Information list = InforDAO.getInformation(maTB, tenTB, sDT, diaChi);
	
		return list;
	}
	
	public InforBO() {
		inforDAO = new InforDAO();
	}
	
}

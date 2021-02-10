package model.Dao;

import db.DB;
import model.Dao.impl.SellerDaoJDBC;
import model.Dao.impl.DepartmentDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
		
	}
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
		
		
	}
	
	
}

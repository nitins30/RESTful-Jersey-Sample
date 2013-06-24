package utility.users.helper.java;

import java.sql.Connection;
import java.sql.Statement;

public class DBMSTable {
	public void createTable(String tableName, String[] column) throws Exception {

		// String
		// quesry="create table "+tableName+"("+column[0]+" varchar(255), "+column[1]+" varchar(255))";
		String quesry = "create table user (name varchar(255), password varchar(255))";
		System.out.println("Create table query=" + quesry);
		Connection con = DataServiceHelper.getInstance().getConnection();
		Statement stat = con.createStatement();
		System.out.println("quesry===>" + stat.execute(quesry));
		DataServiceHelper.getInstance().closeConnection();
	}

	public static void main(String[] args) throws Exception {
		DBMSTable ct = new DBMSTable();
		try {
			ct.createTable("tableName", null);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}

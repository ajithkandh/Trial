package SQL_Examples;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SQL_Exp {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trial", "root", "gold@4195");
		if(con.isClosed())
		{
			System.out.println("THe connection failed");
		}
		else
		{
			System.out.println("Connection success..!");
		}
		Statement var=con.createStatement();
		ResultSet rst=var.executeQuery("select * from trial.example");
		while(rst.next())
		{
			String name=rst.getString("Name");
			System.out.println(name);
		}
	}
	

}

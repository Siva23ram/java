package day14;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class Mysql {

	public static void main(String[] args) {
		try {
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva","root", "Shiva@1201");
        ResultSet rs = s.executeQuery("select * from student1"); 
        CallableStatement cs=cn.prepareCall(myprocedure(?,?));
      
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

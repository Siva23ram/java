package day13;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Multhr {

	public static void main(String[] args) {
		try {
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva","root", "Shiva@1201");
			System.out.println("connection established");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}

}

package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentUpdate {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String sql = "UPDATE student SET name='HARSHAL',email='harshal@mail.com' where id=2";
		Connection connection = null;

		// STEP 1: Load/Register the driver

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish Connection
			connection = DriverManager.getConnection(url, username, password);

			// Establish Statement
			Statement statement = connection.createStatement();
			statement.execute(sql);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				System.out.println("All good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

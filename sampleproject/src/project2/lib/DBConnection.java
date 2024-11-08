package project2.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Description : 오라클DB 연결 <br>
 * Date : 2024. 5. 13. <br>
 * History : <br>
 * - @author : Jewon <br>
 * - 날짜 : 2024. 5. 13. <br>
 * - 설명 : 최초작성 <br>
 * @version 1.0
 */
public class DBConnection {
	public static Connection getConnection() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "ora_user";
		String userpw = "1234";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, userpw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

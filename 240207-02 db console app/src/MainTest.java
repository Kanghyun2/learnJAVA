import static dbutil.MySqlConnectionProvider.closeConnection;
import static dbutil.MySqlConnectionProvider.closeResultSet;
import static dbutil.MySqlConnectionProvider.closeStatement;
import static dbutil.MySqlConnectionProvider.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		 
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT 200 AS VAL");
			
			if (rs.next()) {
				int result = rs.getInt("VAL");
				System.out.println(result == 200 ? "테스트 통과" : "테스트 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResultSet(rs);
			closeStatement(stmt);
			closeConnection(conn);
		}
	}
}

package a22_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class Select {

	public static void main(String[] args) {
		
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 할 때만 사용
		String sql = null;
		
		try {
			con = pool.getConnection();
			sql = "select id, username, password, name, email from user_mst";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // Set 형식의 List로 반환됨.

			// ResultSet.next() == boolean
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
	}
}

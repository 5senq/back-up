package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.MemberDao;
import dao.OutIdDao;

public class MemberService {
	private OutIdDao outIdDao;
	private MemberDao memberDao;	
	
	public int deleteMember(String memberId) {
		int result = 0;
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db58", "root", "java1234");
			conn.setAutoCommit(false); // 자동커밋(execute()) 해지
			
			this.outIdDao = new OutIdDao();
		
			if(this.outIdDao.insertMemberId(conn, memberId) == 1) {
				this.memberDao = new MemberDao();
				this.memberDao.deleteMember(conn, memberId);
			}
			
			conn.commit(); // 쿼리 커밋!
		} catch(Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
		
		
		return result;
	}
	
	
}

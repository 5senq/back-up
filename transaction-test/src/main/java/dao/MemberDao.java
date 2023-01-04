package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vo.Member;

public class MemberDao {
	// 아이디 중복 검사
	// param String : 사용할 아이디
	// return boolean value : true (입력된 아이디 사용가능) / false(사용불가 아이디)
	public boolean checkMemberId(String memberId) {
		boolean result = true;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("");
			conn = DriverManager.getConnection("","","");
			
			String sql = "SELECT t.id"
					+ " FROM (SELECT member_id FROM member UNION SELECT member_id id FROM outId) t"
					+ " WHERE t.id = ?";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, memberId);
			
			rs = stmt.executeQuery();
			
			if(rs.next()) { // 이미 사용된 아이디입니다.
				result = false;
			}
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	// 회원가입
	public int insertMember(Member member) {
		int row = 0;
		
		return row;
	}
	
	// 로그인
	public Member login(Member paramMember) { // String memberId, String memberPw <- Member paramMember로 한번에 받을 수 있다.
		Member resultMember = null;
		
		return resultMember; // 로그인 실패시 null, 성공하면 로그인 Member 객체
	}
	
	// 회원탈퇴
	public int deleteMember(String memberId) {
		int row = 0;
		
		return row;
	}
}

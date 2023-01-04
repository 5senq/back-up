package dao;

import vo.Student;
import java.util.ArrayList;
import java.sql.*;

public class StudentDao {
	public ArrayList<Student> selectStudentList() throws Exception {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/db58","root","java1234");
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM student");
		ResultSet rs = stmt.executeQuery();
		
		ArrayList<Student> list = new ArrayList<Student>();
		while(rs.next()) {
			Student s = new Student();
			s.studentId = rs.getInt("student_id");
			s.familyName = rs.getString("family_name");
			s.name = rs.getString("name");
			s.birth = rs.getString("birth");
			s.city = rs.getString("city");
			s.createdate = rs.getString("createdate");
			s.updatedate = rs.getString("updatedate");
			list.add(s);
		}
		rs.close();
		stmt.close();
		conn.close();
		
		return list;
		
	}

}

package studentdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

	public int studentInsert(StudentBean sb) throws SQLException, ClassNotFoundException {
		Connection con =DBUtil.DBConnection();
		String sql="insert into student1 values(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1,sb.getRegno());
		ps.setString(2, sb.getName());
		int i=ps.executeUpdate();
		return i;
		
	}

}

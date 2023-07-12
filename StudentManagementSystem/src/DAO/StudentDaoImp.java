package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Bean.Student;
import DButil.Utility;
import exceptions.StudentException;

public class StudentDaoImp implements StudentDao{

	
//---------------Insert Student Details---------------------
	@Override
	public String insertStudent(Student s)throws StudentException{
		// TODO Auto-generated method stub
		String msg = "Not inserted";
		
		try(Connection conn = Utility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, s.getsRoll());
			ps.setString(2, s.getsName());
			ps.setString(3, s.getCourseName());
			
			int x = ps.executeUpdate();
			if(x > 0) {
				msg = "Student registration successfull";
			}	
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	
//---------------Insert Student Details---------------------
@Override
	public Student login(Student s) throws StudentException {
		// TODO Auto-generated method stub
	try(Connection conn = Utility.provideConnection()) {
		
		PreparedStatement ps = conn.prepareStatement("select * from student where roll = ? and name = ?");
		ps.setInt(1, s.getsRoll());
		ps.setString(2, s.getsName());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			int r = rs.getInt("sRoll");
			String n = rs.getString("sName");
			String c = rs.getString("courseName");
			s = new Student(r, n, c);
		}
		else {
			
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		return s;
	}
	


}

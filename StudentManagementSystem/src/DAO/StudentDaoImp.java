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
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1, s.getsRoll());
			ps.setString(2, s.getsName());
			ps.setString(3, s.getMobile());
			ps.setString(4, s.getPassword());
			ps.setString(5, s.getCourseName());
			
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

	
//---------------login---------------------
@Override
	public Student login(String name, String pass) throws StudentException {
		
	Student s = new Student();
	
	try(Connection conn = Utility.provideConnection()) {
		
		PreparedStatement ps = conn.prepareStatement("select * from student where name = ? and password = ?");
		ps.setString(1, name);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
//			s = new Student();
			s.setsRoll(rs.getInt("Roll no."));
			s.setsName(rs.getString("Name"));
			s.setMobile(rs.getString("Mobile"));
			s.setPassword(rs.getString("Password"));
			s.setCourseName(rs.getString("Course_Name"));
			 
			if(!s.getPassword().equals(pass)) {
					
					throw new StudentException("Wrong Password");
					
				}
		}
		else {
			throw new StudentException("Invalid EmplUserName or EmplPassword...");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		return s;
	}


//---------------Get student details by roll no---------------------

@Override
public Student getStudentByRoll(int roll) throws StudentException {
	// TODO Auto-generated method stub
	Student s1 = null;
	
	try(Connection conn = Utility.provideConnection()) {
		PreparedStatement ps = conn.prepareStatement("select * from student where roll = ?");
		ps.setInt(1, roll);
		
		ResultSet rs = ps.executeQuery();
		if(rs!=null) {
			if(rs.next()) {
				s1.setsRoll(rs.getInt("roll"));
				s1.setsName(rs.getString("roll"));
				s1.setMobile(rs.getString("roll"));
				s1.setPassword(rs.getString("roll"));
				s1.setCourseName(rs.getString("roll"));
			}
		}
		else {
			System.out.println("Student doesn't exist");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return s1;
}
	


}

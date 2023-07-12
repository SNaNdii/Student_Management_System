package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Bean.Student;
import DButil.Utility;

public class StudentDaoImp implements StudentDao{

	
//---------------Insert Student Details---------------------
	@Override
	public String insertStudent(Student s){
		// TODO Auto-generated method stub
		String msg = "Not inserted";
		
		try(Connection conn = Utility.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");
			ps.setInt(1, s.getsRoll());
			ps.setString(2, s.getsName());
			ps.setString(3, s.getCourseName());
			
			int x = ps.executeUpdate();
			if(x > 0) {
				msg = "Data inserted";
			}	
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}
	
//---------------Insert Student Details---------------------

}

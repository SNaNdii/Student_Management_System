package UseCase;

import java.util.Scanner;

import Bean.Student;
import DAO.StudentDao;
import DAO.StudentDaoImp;

public class InsertStudentDetailsUseCase {

	public static boolean main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Roll no : ");
		int roll = sc.nextInt();
		System.out.println("Enter your Name : ");
		String name = sc.next();
		System.out.println("Enter your Mobile no : ");
		String mobile = sc.next();
		System.out.println("Enter your password : ");
		String pass = sc.next();
		System.out.println("Enter your Course name : ");
		String cName = sc.next();
		
		
		Student s = new Student();
		s.setsRoll(roll);
		s.setsName(name);
		s.setMobile(mobile);
		s.setPassword(pass);
		s.setCourseName(cName);
		
		StudentDao dao = new StudentDaoImp();
		
		try {
			String res = dao.insertStudent(s);
			System.out.println(res);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return false;
		}
	}
}

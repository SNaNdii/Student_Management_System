package UseCase;

import java.util.Scanner;

import Bean.Student;
import DAO.StudentDao;
import DAO.StudentDaoImp;
import exceptions.StudentException;

public class login {

	public static boolean main(String[] args) throws StudentException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll no : ");
		int roll = sc.nextInt();
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		Student s = new Student();
		s.getsRoll();
		s.getsName();
		
		StudentDao dao = new StudentDaoImp();
		Student res = dao.login(s);
		System.out.println(res);
		return true;
		
	}
}

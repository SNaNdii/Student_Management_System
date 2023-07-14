package UseCase;

import java.util.Scanner;
import Bean.Student;
import DAO.StudentDao;
import DAO.StudentDaoImp;
import exceptions.StudentException;

public class GetStudentByRoll {

	public static void main(String[] args) throws StudentException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll no. ");
		int roll = sc.nextInt();
		
//		Student s = new Student();
//		s.setsRoll(roll);
		
		StudentDao dao = new StudentDaoImp();
		Student res = dao.getStudentByRoll(roll);
		System.out.println(res);
	}
}

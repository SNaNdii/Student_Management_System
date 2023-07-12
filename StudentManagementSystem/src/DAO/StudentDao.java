package DAO;

import Bean.Student;
import exceptions.StudentException;

public interface StudentDao {
	public String insertStudent(Student s)throws StudentException;
	public Student login(Student s)throws StudentException;
}

package org.student;
import org.department.Department;


public class Student extends Department {
	public void StudentName() {
System.out.println("Student name is Kevin ");
	}
	public void StudentDept() {
System.out.println("STudent department is CS");
	}
public void studentid() {
System.out.println(" Student id is: 006 ");
}
public static void main(String[] args) {
Student ob =new Student();
	ob.collegeName();
	ob.collegeName();
	ob.collegeRank();
	ob.StudentName();
	ob.StudentDept();
	ob.studentid();
	ob.departentName();
	
}
}

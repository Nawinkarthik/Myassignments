package polymorphism;

public class Students {
	private void getStudentinfo(String studentname) {
System.out.println(studentname);
	}
	private void getStudentinfo(int studentrollno) {
		System.out.println(studentrollno);
	}
	private void getStudentinfo(int studentclass,int studentage) {
		System.out.println(studentclass +studentage);
		
	
	}
	private void getStudentinfo(String studentgrade,double studentattendancepercent) {
		System.out.println(studentgrade + " " +studentattendancepercent);
	}
	public static void main(String[] args) {
		Students ob=new Students();
		ob.getStudentinfo(96);
		ob.getStudentinfo("kevin");
		ob.getStudentinfo(8, 14);
		ob.getStudentinfo("A", 89.97);
		
	}

}

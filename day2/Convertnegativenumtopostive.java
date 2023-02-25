package day2;

public class Convertnegativenumtopostive {
	public static void main(String[] args) {
		int num =-6;
		
		if (num>0) {
			System.out.println("The number is postive : "+num);
		}
		else if (num<0) {
			num=num*-1;
			System.out.println("The converted number negative to postive number :"+num);
			
		}
	}

}

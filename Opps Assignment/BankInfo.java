package polymorphism;

public class BankInfo {
	public void saving() {
		System.out.println(" This is saving account perecent is 6%");
	}
	public void fixed() {
		System.out.println("This is fixed account perecent is 7%");
	}
	public void deposit() {
		System.out.println("This is deposit account perecent is 8%");
	}
	public static void main(String[] args) {
		BankInfo ob= new BankInfo();
		ob.saving();
		ob.fixed();
		ob.deposit();
	}

}

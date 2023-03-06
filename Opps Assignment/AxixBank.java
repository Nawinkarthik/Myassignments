package polymorphism;

public class AxixBank extends BankInfo {
	public void deposit() {
		System.out.println("This is deposit acount percent is:8%");
	}
	public static void main(String[] args) {
		AxixBank og= new AxixBank();
		og.deposit();
		
	

	}

}

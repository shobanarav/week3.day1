package week3.day1;

public class BankInfo {
	
	public void saving() 
	{
		System.out.println("Savings Account");
	}
	
	public void fixed()
	{
		System.out.println("Fixed Account");
	}
	
	public void deposit()
	{
		System.out.println("Depositing");
	}
	
	public static void main(String[] args) {
		
		AxisBank var = new AxisBank();
		
		var.deposit(); //able to call deposit of axis bank (overriding)
		
		BankInfo var2 = new BankInfo();
		
		var2.deposit();
	
	}

}

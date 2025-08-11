package Static;

public class Bank {
	static double interestRate;
	
	public static void setInterestRate(double rate)
	{
		interestRate = rate;
	}
	
	public double calculateInterest(double amount)
	{
		return amount * interestRate / 100;
	}
	public static void main(String[] args) {
		Bank.setInterestRate(2.5);
		Bank b = new Bank();
		System.out.println("Calculate Interest Rate of 10000 : "+b.calculateInterest(10000));
		
		Bank.setInterestRate(5.5);
		System.out.println("calculate the rate of Intreste of 20000 : "+b.calculateInterest(20000));
	}

}

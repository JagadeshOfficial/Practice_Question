package Exception;

class WithdrawException extends Exception
{
	WithdrawException(String msg)
	{
		super(msg);
	}
}

public class Account {
	
	double amount;
	double balance;
	
	void withdraw(double amount, double balance) throws WithdrawException
	{
		if(amount > balance)
		{
			throw new WithdrawException("Insufficient Balance");
		}
		else
		{
			double withdraw1 = amount - balance;
			System.out.println("Withdraw Succesfully "+withdraw1);
		}
	}
	

	public static void main(String[] args) {
		Account w = new Account();
		try
		{
			w.withdraw(5000.0, 20000.0 );
		}catch(WithdrawException e)
		{
			System.out.println("Exception Caught : "+e.getMessage());
			e.printStackTrace();
		}

	}

}

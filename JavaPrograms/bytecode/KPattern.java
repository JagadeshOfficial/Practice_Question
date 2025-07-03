package Exception;
class product
{
	int pid;
	String pname;
	double psal;
	
	product(int pid, String pname, double psal)
	{
		this.pid = pid;
		this.pname = pname;
		this.psal = psal;
		
	}
	public String toString()
	{
		return pid+ " "+ pname+" "+ psal;
	}
	
}
public class ToStringDemo {

	public static void main(String[] args) {
		product prod = new product(101, "Mobile", 500.0);
		System.out.println(prod);

	}

}

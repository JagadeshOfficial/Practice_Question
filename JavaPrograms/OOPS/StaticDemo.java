package OOPS;

class Myclass 
{
	int m;
	static int n;
	
	void xxx()
	{
		m = 20;
		n = 10;
	}
	
	static void yyy()
	{
		
		n = 40;
	}
	
	void display()
	{
		System.out.println("M = "+m+ " n = "+n);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Myclass m1 = new Myclass();
		m1.xxx();
		m1.display();
		Myclass m2 = new Myclass();
		m2.yyy();
		m2.display();

	}

}

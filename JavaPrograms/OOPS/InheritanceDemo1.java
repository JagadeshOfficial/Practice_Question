package OOPS;


class Base1
{
	int i;
	int j;
	
	void input(int i , int j)
	{
		this.i = i;
		this.j = j;
	}
	void display()
	{
		System.out.println("I= "+i +" "+ "J =" +j);
	}
}

class derived1 extends Base1
{
	int k;
	void input(int k)
	{
		this.k = k;
	}
	
	void display()
	{
		super.display();
		System.out.println("K= "+k);
	}
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		Base1 b = new Base1();
		b.input(1, 2);
		b.display();
		derived1 d = new derived1();
		d.input(30,40);
		d.display();
		d.input(50);
		d.display();
		
		
		

	}

}


package OOPS;
class Base
{
	int i;
	int j;
	
	void inputij(int i , int j)
	{
		this.i = i;
		this.j = j;
	}
	void displayij()
	{
		System.out.println("I= "+i +" "+ "J =" +j);
	}
}

class derived extends Base
{
	int k;
	void inputl(int k)
	{
		this.k = k;
	}
	
	void displayk()
	{
		System.out.println("K= "+k);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Base b = new Base();
		b.inputij(1, 2);
		b.displayij();
		derived d = new derived();
		d.inputij(30, 40);
		d.displayij();
		d.inputl(50);
		d.displayk();
		
		

	}

}

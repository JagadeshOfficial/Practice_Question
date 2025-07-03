package OOPS;
class Sample
{
	int i;
	int j;
	
	Sample(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	void display()
	{
		System.out.println("I = "+i+" "+"J = "+j);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Sample s = new Sample(10,20);
		s.display();
		

	}

}

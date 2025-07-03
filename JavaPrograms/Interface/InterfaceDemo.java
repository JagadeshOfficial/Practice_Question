package Interface;

interface Shape
{
	void Draw();
	default void Fill() {
		System.out.println("Fill the Color");
	}
}

class Circle implements Shape
{
	public void Draw()
	{
		System.out.println("Draw A Circle");
	}
}

public class InterfaceDemo {

	public static void main (String[]args)
	{
		//Shape s = new Shape(); //Error
		Shape s = new Circle();
		
		s.Fill();
		s.Draw();
	}
}

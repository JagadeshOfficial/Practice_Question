package Lamda;
@FunctionalInterface

interface phone
{
	void call();
}

class AP implements phone{

	@Override
	public void call() {
		System.out.println("Calling");
		
	}
	
}


public class LambdaDemo {

	public static void main(String[] args) {
		/*phone p = new AP();
		p.call();
		
		phone p1 = new phone()
				{
			public void call()
			{
				System.out.println("Calling");
			}
				};
				p1.call();*/
		phone p2 = () -> {
			System.out.println("Calling");
		};
		p2.call();

	}

}

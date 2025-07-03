package Threads;

class Threadx extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		t.setName("Jagadesh");
		for(int i = 0; i <=10; i++)
		{
		System.out.println(t.getName()+ " : " +i);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}


class Thready extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		t.setName("Anuradha");
		for(int i =10; i>=1; i--)
		{
			System.out.println(t.getName()+ " : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadDemo {

	public static void main(String[] args) {
		Threadx t = new Threadx();
		t.start();
		Thready t1 = new Thready();
		t1.start();

	}

}

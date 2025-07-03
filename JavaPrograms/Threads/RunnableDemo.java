package Threads;


class ThreadR implements Runnable
{
	public void run()
	{
		for(int i =1; i<10; i++)
		{
			System.out.print(i+ " ");
		}
	}

	
}

public class RunnableDemo {

	public static void main(String[] args) {
		ThreadR t = new ThreadR();
		Thread t1 = new Thread(t);
		t1.start();

	}

}

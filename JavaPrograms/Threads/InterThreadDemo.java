package Threads;

class ThreadSum extends Thread
{
	int sum;
	public void run()
	{
		for(int i =0; i<=100; i++)
		{
			sum = sum + i;
		}
		
		synchronized(this)
		{
			notify();
		}
	}
}


public class InterThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadSum ts = new ThreadSum();
		ts.start();
		
		synchronized(ts)
		{
		ts.wait();
		}
		System.out.println("Sum : "+ ts.sum);
	}

}

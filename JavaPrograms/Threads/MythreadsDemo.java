package Threads;

class MyThread extends Thread
{
	public void run()
	{
		//System.out.println("I am a Thread");
		Thread t =  Thread.currentThread();
		System.out.println(t); //Thread[Thread-0,5,main]
		t.setName("Jagadesh");
		System.out.println(t);
		System.out.println(t.getName());
		t.setPriority(8);
		System.out.println(t);	
	}	
}

public class MythreadsDemo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

	}

}

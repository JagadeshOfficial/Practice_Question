package Threads;

class Table
{
	synchronized void PrintTable(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n + " * "+i+ " = "+(n*i));
		}
	}
}

class ThreadX extends Thread
{
	Table t;
	ThreadX(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.PrintTable(8);
	}
}

class ThreadY extends Thread
{
	Table t;
	ThreadY(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.PrintTable(7);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		Table t = new Table();
		ThreadX t1 = new ThreadX(t);
		t1.start();
		ThreadY t2 = new ThreadY(t);
		t2.start();

	}

}

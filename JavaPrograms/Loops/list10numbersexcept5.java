package Loops;
import java.util.Scanner;
public class list10numbersexcept5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i<=10)
		{
			if(i==5)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}

}

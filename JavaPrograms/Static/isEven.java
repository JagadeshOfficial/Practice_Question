package Static;
//import java.util.*;
public class isEven {
	
	public static boolean isEven(int Number)
	{
	//Scanner sc = new Scanner(System.in);
	return Number % 2 == 0;
	}
	public static void main(String[] args) {
		int n[] = {2,4,5,6,8};
		for(int num: n)
		{
		System.out.println(num + " isEven? " + isEven(num));
		}
	}

}

package Static;

public class ArrayUtil {
	public static int findMax(int[] arr)
	{
		int max = arr[0];
		for(int num : arr)
		{
			if(num>max)
			{
				max = num;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
	int array[] = {5,100,8,5};
	System.out.println("Maximum Number is : "+findMax(array));

	}

}

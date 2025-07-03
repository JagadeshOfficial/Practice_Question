//WAP to display multiplication tables from 1 to 10

package ControlStatements;

public class onetotentables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=10; i++)
		{
			System.out.println("This is the Table of :" +i);
			for(int j=1; j<=10; j++)
			{
				int table = i*j;
				
				System.out.println(+i+ " * " +j+ " = "+table);
				
			}
			
		}
	}

}

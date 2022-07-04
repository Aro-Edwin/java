import java.util.Scanner;

public class oddoreven {
	public static void main(String args[])
	{
		//this code we get a array input and check odd or even
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Limit :");
		int num=in.nextInt();
		int a[]=new int[num];
		int odd=0,eve=0,i;
		for(i=0;i<num;i++)
		{
			System.out.println("Enter Your ith "+i+" value");
			a[i]=in.nextInt();
			
		}
		for(int element : a)
		{
			//System.out.println(element);
			if(element%2==0)
			{
				System.out.println(element+" is a even number");
				eve++;
			}
			else
			{
				System.out.println(element+" is a odd number");
				odd++;
			}
		}
		System.out.println("Total odd number = "+odd+ "  Total even number is = "+eve);
		
	}

}

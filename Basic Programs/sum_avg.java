import java.util.Scanner;
public class sum_avg {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Limit :");
		int n=in.nextInt();
		int sum,a,avg;
		a=
		sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Numer is "+i);
			a=in.nextInt();
			sum+=a;
		}
	
		System.out.println("The sum of "+n+" Numer is "+sum);
		System.out.println("Avg of given nubera "+sum/n);
		
	}
	

}

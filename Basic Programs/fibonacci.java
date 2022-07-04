import java.util.Scanner;
public class fibonacci {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Number :");
		int n=in.nextInt();
		int a=-1,b=1,c;
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}

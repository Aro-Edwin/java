import java.util.Scanner;

public class strongnumber {

	public static void main(String[] args) {
		/*this is method for strong number  
		   145  1 1
		        4 24
		        5 120
		        + 145*/
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your NUmber: ");
		int num=in.nextInt();
		int rem,fact=1,sum=0,real,i;
		real=num;
		while (num>0)
		{
			rem=num%10;
			//System.out.println(+rem);
			for(i=1;i<=rem;i++)
			{
				fact*=i;
			}
			//System.out.println(+fact);
			sum=sum+fact;
			num/=10;
			fact=1;
			
		}
		//System.out.println(+sum);
		if(sum==real)
		{
		System.out.println("The Strong Number is "+sum);
		}
		else {
			System.out.println(real+ " Is not a Strong number ");
		}

	}

}

import java.util.Scanner;
public class armstrong_numbers {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int res,temp;
		int dig1,dig2,dig3;
		for(int num=100;num<=999;num++)
		{
			 temp=num;
			 dig3=temp%10;
			 temp=temp/10;
			 dig2=temp%10;
			 temp=temp/10;
			 dig1=temp%10;
			 int result=(dig1*dig1*dig1)+(dig2*dig2*dig2)+(dig3*dig3*dig3);
			 if(result==num)
			    {
			    	System.out.println("The number is armstrongnumbers: "+num);
			    }
			    
		}
	}

}

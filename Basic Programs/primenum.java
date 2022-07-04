import java.util.Scanner;
public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner (System.in);
		System.out.println("Enter Your checking number : ");
		int num=in.nextInt();
		int div=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				div++;
			}
			
		}
		if(div==2)
		{
			System.out.println(num+ " This is a Prime Number");
		}
		else
		{
			System.out.println(num+ " This is not a Prime Number");
		}
	}

}

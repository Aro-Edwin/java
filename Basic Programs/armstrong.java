import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Your 3 Digit Nuber : ");
		int num=in.nextInt();
	    int temp=num;
	    int dig1,dig2,dig3;
	    if(num<=999 || num<=100)
	    {
	    dig3=temp%10;
	    temp=temp/10;
	    dig2=temp%10;
	    temp=temp/10;
	    dig1=temp%10;
	    int result=(dig1*dig1*dig1)+(dig2*dig2*dig2)+(dig3*dig3*dig3);
	    if(result==num)
	    {
	    	System.out.println("The number is armstrongnumber: "+num);
	    }
	    else
	    {
	    	System.out.println(num+ "Is Not a Armstrong Numer");
	    }
	    }
	    else
	    {
	    	System.out.println("Enter Correct 3 digit Number!!!");
	    }
	}

}

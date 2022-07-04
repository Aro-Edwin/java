import java.util.Scanner;
public class swit {
	public static void main(String args[])
	{
		int ch;
	System.out.println("Welcome to Switch Case");
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your Case: ");
	ch=in.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("You Choose 1");
		break;
	case 2:
		System.out.println("You Chosse 2");
		break;
	default:
		System.out.println("Invalid input");
		
	}
	}
}

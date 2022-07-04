import java.util.Scanner;
public class helloworld {

	public static void main(String[] args) {
	System.out.println("Enter your Age");
	int age;
	Scanner in=new Scanner(System.in);
	age=in.nextInt();
	if(age>=18)
	{
		System.out.println("Your Eligible For Vote");
	}
	else
	{
		System.out.println("Your not eligible For Voting");
	}

	}

}

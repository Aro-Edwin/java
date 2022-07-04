import java.util.Scanner;
public class multipication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("Enter Your Multipilcation Number: ");
		int num=in.nextInt();
		System.out.println("Enter your limit: ");
		int lim=in.nextInt();
		for(int i=1;i<=lim;i++)
		{
			int mul=i*num;
			System.out.println(i+"*"+num+ "="+mul);
		}

	}

}

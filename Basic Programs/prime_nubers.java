import java.util.Scanner;
public class prime_nubers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num,div=0;
		for(num=1;num<=999;num++){
			for(int i=1;i<=num;i++){
			if(num%i==0)
			{
				div++;
			}
			
			}
			if(div==2)
			{
			System.out.println(num+ " This is a Prime Number");
			}
			//else
			//{
			//System.out.println(num+ " This is not a Prime Number");
			//}
			div=0;

		}
	}

}

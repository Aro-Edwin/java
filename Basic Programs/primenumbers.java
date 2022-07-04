import java.util.Scanner;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the limits you want the perfect Number :");
		int num=in.nextInt();
		int sum=0,j;
		for(j=1;j<num;j++) {
			for(int i=1;i<j;i++) {
			if(j%i==0) {
				sum+=i;
			}
			
			}
			if(sum==j) {
			System.out.println(num+" is a Perfect Number");
			}

			}
			sum=0;
	}

}

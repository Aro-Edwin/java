import java.util.Scanner;

public class decmal_to_binary {
	public static void dec2bin(int num) {
		int [] a=new int [1000];
		int i=0;
		while(num>0) {
			a[i]=num%2;
			System.out.print(+a[i]);
			//System.out.println("");
			num/=2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			
		System.out.print(+a[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Decimal No : ");
		int num=in.nextInt();
		System.out.println("Decimal Value : "+num);
		System.out.println("Binary Value:");
		dec2bin(num);

	}

}

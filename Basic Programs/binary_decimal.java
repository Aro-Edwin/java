import java.util.Scanner;

public class binary_decimal {
	public static int bin2dec(int bin) {
		int decemal=0,power=0;
		while(bin!=0) {
			int remainder=bin %10;
			decemal+=remainder*Math.pow(2, power);
			bin=bin/10;
			power++;
		}
		return decemal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Binary value to conver Decimal  : ");
		int bin=in.nextInt();
		System.out.println("Decimal Value :"+bin2dec(1100));

	}

}

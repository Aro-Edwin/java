import java.util.Arrays;
import java.util.Scanner;

public class Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one=0;
		int two=1;
		int a[][]= {{10,20,30},
					{11,21,31},
					{13,14,15}		
							 };
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
		int [][]b=new int[3][3];
		//int [][][] c=new int [10][10][10];
		for(int i=0;i<3;i++) {
			one++;
			two=1;
			for(int j=0;j<3;j++) {
				Scanner in=new Scanner(System.in);
				System.out.println("Enter Your "+one + two+ " NUmber :");
				b[i][j]=in.nextInt();
				two++;
			}
			
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(" "+b[i][j]);
			}
			System.out.println("");
		
		
			//System.out.println(Arrays.toString(b));
		}
	}
		

}

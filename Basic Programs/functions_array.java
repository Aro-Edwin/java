import java.util.Arrays;
import java.util.Scanner;

public class functions_array {
	public static int[] sortarray() {    //class kulla vara nala static use pantrom
		Scanner in=new Scanner (System.in);
		System.out.println("Enter Your Array Limit :");
		int num=in.nextInt();
		int [] a=new int [num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter Your "+i+" Value : ");
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		return a;
		//return new int[] {1,2,3};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=sortarray();
		for(int a:arr) {
			System.out.println(a);
		}
		

	}

}

import java.util.Arrays;
import java.util.Scanner;

public class arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Array");
		int num=1;
		int [ ] a=new int[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter your "+num+" Numer:");
			a[i]=in.nextInt();
			num=num+1;
			
		}
		for(int element :a) {
			System.out.println(element);
			System.out.println(Arrays.toString(a));
		}

	}

}

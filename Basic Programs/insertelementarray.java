import java.util.Arrays;
import java.util.Scanner;

public class insertelementarray {

	public static void main(String[] args) {
		// array we can insert a new number specific index in a array
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Before Insert a number Array : "+Arrays.toString(a));
		Scanner in=new Scanner(System.in);
		System.out.println("Enter index location of u want insert 0 to 9 :");
		int index=in.nextInt();
		if(index<10) {	
		System.out.println("Enter the Value u want insert");
		int val=in.nextInt();
		for(int i=a.length-1;i>index;i--) {
			a[i]=a[i-1];
			
		}
		a[index]=val;
		System.out.println("After Insert a number Array : "+Arrays.toString(a));
		}
		else {
			System.out.println("Invalid Input!!!! Enter Correct Input");
		}
		

	}

}

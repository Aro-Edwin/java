import java.util.Scanner;
public class perfectnumber {

	public static void main(String[] args) {
		// perfect number na oru number divide panna remaing 0 varum  appo divide panna number plus panna same number varum 
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the Number :");
		int num=in.nextInt();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
			
		}
		if(sum==num) {
			System.out.println(num+" is a Perfect Number");
		}
	}

}

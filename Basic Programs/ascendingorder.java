import java.util.Arrays;

public class ascendingorder {

	public static void main(String[] args) {
		//simple sort problem
		int a[]=new int[] {34,12,53,67,39};
		System.out.println("Before Sort :");
		System.out.println(Arrays.toString(a));//this is a alternative method to print array
		/*for(int element:a)
		{
			System.out.println(element);
			//
		}*/
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]) //change the value < and > u can easy change
				{
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		}
		System.out.println("After Sort :");
		System.out.println(Arrays.toString(a));
	}
	
}

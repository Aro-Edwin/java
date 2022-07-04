
public class dupicate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,5,6,7,3,2,5,7,9};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j]&&(i != j)) {
				System.out.println("Duplicate Number is :"+a[i]);
			}
			
			//System.out.print("Duplicate Number is"+a[i]);
			
			}
			//System.out.println("   Duplicate Number is "+a[i]);
		}
		
	}

}

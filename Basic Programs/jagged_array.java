
public class jagged_array {

	public static void main(String[] args) {
		// print the jagged array
		int a[][]= {{10,20,30},
				{11,31},
				{13,14,15}		
						 };
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println("");

	}
	}

}

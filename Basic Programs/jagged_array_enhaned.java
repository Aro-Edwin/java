
public class jagged_array_enhaned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{11,12,13,14,15},
					{21,22,23,25},
					{31,32,33,34,35}
		            };
		for(int k[]:a) {
			for(int l:k) {
				System.out.print(" "+l);
			}
			System.out.println("");
		}
		
	}

}

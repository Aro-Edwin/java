class example {
	private int m,n;
	
	example (int x,int y) {
		m=x;
		n=y;
	}
	int large() {
		if(m>n)
			return m;
		else
			return n;
	}
	void display() {
		int largest=large();
		System.out.println("The Large Number Is :"+largest);
	}
}
public class nested_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example obj1=new example(20,10);
		obj1.display();
		

	}

}

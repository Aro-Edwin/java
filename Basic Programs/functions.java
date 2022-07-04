class methods{
	public void add() {
		//no return without argument
		int a=120;
		int b=120;
		System.out.println("Addition "+(a+b));
	}
	public void sub(int x,int y) {
		//void vanthal not return
		//value namma send panna with argument
		//no return with argument
		System.out.println("Subraction :"+(x-y));
		
	}
	public int mul() {
		//return type without argument
		int a=10;
		int b=10;
		return a*b;
	}
	public int div(int x,int y) {
		//return type with arguments
		return (x/y);
	}
	//recursion function
	public int factorial(int n) {
		if(n==1)
			return 1;
		else
			return(n*factorial(n-1));
	}
	
	
}
public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methods o = new methods();
		o.add();
		o.sub(40, 20);
		System.out.println("Multipilication :"+o.mul());
		System.out.println(" Division :"+o.div(40, 10));
		System.out.println("recursion function factorial :"+o.factorial(5));
	}

}

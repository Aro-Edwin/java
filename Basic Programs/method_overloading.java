class maths1{
	//method overload have a same function name but different type of parameter 1.int 2.double ....
	public static int multiply(int a,int b) {
		return a*b;
		//return type parameters also differ values
	}
	public static double mutiply(double x,double y) {
		return x*y;
	}
	public static double multiply(double i,int j) {
		return i*j;
	}
}
public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("multiply of 2 int number "+maths1.multiply(5, 5));
		System.out.println("multiply of 2 double number "+maths1.mutiply(6, 6));
		System.out.println("multiply of int and double number "+maths1.multiply(6, 5));
	}

}

class maths {
	public static int power(int base,int power) {    //static use panna kela obj create panna venam
		int result=1;
		for(int i=1;i<=power;i++) {
			result*=base;
		}
		return result;
		
	}
}
public class staticmember_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println(Math.abs(-567));
	   System.out.println("Power : "+maths.power(5, 5));

	}

}

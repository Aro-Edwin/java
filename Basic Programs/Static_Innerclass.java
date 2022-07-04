class outerclass{
	static int a=10;
	int b=20;
	
	static class innerclass{ //static can u can use only a static value
		void display() {
			System.out.println("The static value of a is :"+a);
		}
	}
}
public class Static_Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass.innerclass obj=new outerclass.innerclass();
		obj.display();

	}

}

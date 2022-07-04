class overloading{
	float length,width;
	
	public overloading(){  //this program constructor overloading two constructor called at the same time
		length=10;
		width=20;
	}
	public overloading(float x,float y) { //parameterized constructor 
		length=x;
		width=y;
		
	}
	public overloading(float x) {
		width=x;
		length=x;
	}
	float area() {
		return length*width;
	}
}
public class constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading obj1=new overloading();
		obj1.area();
		System.out.println(obj1.area());
		overloading obj2=new overloading(30,30);
		System.out.println(obj2.area());
		overloading obj3=new overloading(6);
		System.out.println(obj3.area());
		

	}

}

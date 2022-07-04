class demo {
	private int real,img;
	
	public demo() {
		this.real=5;
		this.img=4;
	}
	public demo(int x,int y) {
		this.real=x;
		this.img=y;
	}
	public demo(demo obj2) { // copy constructor 
		this.real=obj2.real;
		this.img=obj2.img;
		
	}
	public String tostring() {
		return "("+real+"+"+img+"i)";
	}
}
public class copy_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo obj1=new demo();
		System.out.println(obj1.tostring());
		demo obj2=new demo(5,5);
		System.out.println(obj2.tostring());
		
		demo obj3=new demo(obj2); // copy constructor
		System.out.println(obj3.tostring());
		

	}

}

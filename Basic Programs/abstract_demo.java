abstract class shape1{
	abstract void draw();
	void display() {
		System.out.println("Message From Shape");
	}
}
class triangle extends shape1 {

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Message From Traiangle");
	}
	
}
public class abstract_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle obj=new triangle();
		obj.draw();
		obj.display();
	}

}

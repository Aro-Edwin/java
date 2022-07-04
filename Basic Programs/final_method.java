class super1{
	void display(){
		System.out.println("I am super Display");
	}
	
	final void finaldisplay() {                    ///we cannot overwrite this function in ant other function
		System.out.println("I am final Display");
	}
}
class subclass extends super1{
	void display() {
		System.out.println(" I am subclass display");
	}
}
public class final_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super1 obj1=new super1();
		subclass obj=new subclass();
		obj1.display();
		obj1.finaldisplay();
		obj.display();
	}

}

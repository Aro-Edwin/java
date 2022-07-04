abstract class outerclasss{
	abstract void display();
}
class outerdemo{
	void outerdisplay() {
		outerclasss obj=new outerclasss() {
			void display() {
				System.out.println("test display");
			}
		};
		obj.display();
	}
	
}
public class anonymous_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerdemo obj=new outerdemo();
		obj.outerdisplay();
	}

}

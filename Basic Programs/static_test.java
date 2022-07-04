class staticvari{
	static int  a=10;
	int b=30;
	void show() {    //we can use other methods function static vaulubles
		System.out.println(+a);
		System.out.println(+b);
	}
	static void display() {
		System.out.println(+a);// static value store same memory location
	}
	
}
public class static_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvari obj=new staticvari();
		obj.show();
		obj.display();
		obj.b=50;
		obj.show();
		obj.a=100;
		obj.display();
		obj.show();
	}

}

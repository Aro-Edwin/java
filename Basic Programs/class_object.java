class rectangle{
	int length, width;
	
	void setvalue(int x,int y) {
		length=x;
		width=y;
	}
	int area() {
		int a=length*width;
		return a;
	}
	
}
public class class_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle obj1=new rectangle();
		rectangle obj2=new rectangle();
		obj1.length=20;
		obj1.width=10;
		System.out.println(obj1.area());
		obj2.setvalue(10, 40);
		System.out.println(+obj2.area());
		

	}

}

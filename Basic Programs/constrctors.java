class newtype{
	int length,width;
	
	public newtype(){  //constructors should have same class name  *should use public or deafault acess specfier 
		length=5;
		width=12;
	}
	
	int area() {
	int a=length*width;
	return a;
	}
	
}
public class constrctors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newtype obj=new newtype(); 
		System.out.println(obj.area());

	}

}

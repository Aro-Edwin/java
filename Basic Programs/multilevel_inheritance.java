class grandfather {
	public void land() {
		System.out.println("i have land");
	}
	
}
class father1 extends grandfather{
	public void car() {
		System.out.println("i have car");
	}
}
class son1 extends father1{
	public void house() {
		System.out.println("i have house");
	}
	
}
public class multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son1 obj1=new son1();
		obj1.land();
		obj1.car();
		obj1.house();

	}

}

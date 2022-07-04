class father{
	public void house() {
		System.out.println("I have a house");
	}
}
class son extends father{
	public void car() {
		System.out.println("i have a car");
	}
}
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son obj=new son();
		obj.house();
		obj.car();

	}

}

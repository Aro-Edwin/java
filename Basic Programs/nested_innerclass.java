class outer{
	int a=10;
	class inner{
		int b=20;
		void innerdisplay() {
			System.out.println(+a);
			System.out.println(+b);
			System.out.println("inner");
		}
	}
	void outerdisplay() {
		inner obj1=new inner();
		obj1.innerdisplay();
		System.out.println("Outer Display");
	}
}
public class nested_innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj1=new outer();
		obj1.outerdisplay();
		System.out.println("----------Inner only----------");
		outer.inner obj2=new outer().new inner();
		obj2.innerdisplay();

	}

}

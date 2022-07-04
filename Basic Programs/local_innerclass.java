class outercls{
	void display() {
		class inner{
			void innerdisplay() {
				System.out.println("InnerDisplay");
			}
		}
		inner obj=new inner();
		obj.innerdisplay();
	}
}
public class local_innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outercls obj=new outercls();
		obj.display();
	}

}

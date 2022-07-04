abstract class mobile{
	void voicecall() {
		System.out.println("You Can Make a Call");
	}
	abstract void camera();
	abstract  void display();
	
}
class samsung extends mobile{

	@Override
	void camera() {
		// TODO Auto-generated method stub
		System.out.println("Samsung camer is 16MP");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("samsung Display 16inch");
	}
	void fingerprint() {
		System.out.println("Samsung Have Right  Side Print");
	}
	
}
class nokia extends mobile{

	@Override
	void camera() {
		// TODO Auto-generated method stub
		System.out.println("Nokia camer is 12MP");
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Nokia Display is 14inch");
	}
	
}
public class abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samsung obj1=new samsung();
		nokia obj2=new nokia();
		System.out.println("Samsung Mobile Details");
		System.out.println();
		obj1.camera();
		obj1.display();
		obj1.fingerprint();
		System.out.println("-------------------------------------");
		System.out.println("Nokia Mobile Details");
		System.out.println();
		obj2.camera();
		obj2.display();
		

	}

}

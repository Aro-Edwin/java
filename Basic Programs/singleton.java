class abc{
	static abc obj=null;
	private abc(){}
	static abc getinstance() {
		if(obj==null)
			obj=new abc ();
			return obj;
	}
	void diplay() {
		System.out.println("I am Printing");
	}
}
public class singleton { //the singleton we can create only one object we cannot create more than one object

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc obj=abc.getinstance();
		obj.diplay();
	}

}

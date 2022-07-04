class getvalue{
	private int length,width;
	
	int getlength() {
		return length;
	}
	int getwidth() {
		return width;
	}
	void setlength(int l) {
		if(l>0)
		length=l;
		else
			l=0;
	}
	void setwidth(int w) {
		if(w>0)
		width=w;
		else
			w=0;
		
	}
	
	int area() {
		int a=length*width;
		return a;
	}
}
public class getter_setter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getvalue obj=new getvalue();
		obj.setlength(20);
		obj.setwidth(10);
		System.out.println("Area of "+obj.getlength()+"*"+obj.getwidth()+"="+obj.area());
		
		
		

	}

}

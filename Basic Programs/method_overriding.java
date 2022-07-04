class user{
	String name;
	int age;
	user(String n,int x){
		this.name=n;
		this.age=x;
	}
	void display() {
		System.out.println("NAME :"+name);
		System.out.println("AGE :"+age);
	}
}
class user1 extends user{
	String company;
	user1(String n,int x,String c){
		super(n,x); //method overriding we can use super class to defing value user1 to user method
		company=c;
	}
	void display() {
		System.out.println("NAME :"+name);
		System.out.println("AGE :"+age);
		System.out.println("COMPANY :"+company);
		
	}
	
}
public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user obj1=new user("aro",21);
		user1 obj2=new user1("edwin",21,"sodexo");
		obj1.display();
		obj2.display();
	}

}

class finaltest{
	final int MIN=1;//the final value once we initialse never change
	final int MAX;
	final int NORMAL;
	
	finaltest(int normal){
		NORMAL=normal;
		MAX=100;
	}
	void display() {
		System.out.println("MIN :"+MIN);
		System.out.println("MAX :"+MAX);
		System.out.println("NORAML :"+NORMAL);
	}
}
public class final_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finaltest obj=new finaltest(50);
		obj.display();
		
	}

}

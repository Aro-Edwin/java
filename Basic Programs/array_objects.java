class student{
	public int roll_no;
	public String Name;
	
	public student(int no,String y) {
		this.roll_no=no;
		this.Name=y;
	}
	void print() {
		System.out.println("Name : "+Name);
		System.out.println("Roll_no : "+roll_no);
		System.out.println("________________________________________________");
	}
}
public class array_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] obj; 
		obj=new student[5];
		obj[0]=new student(1,"ram");
		obj[1]=new student(2,"ram2");
		obj[2]=new student(3,"ram3");
		obj[3]=new student(4,"ram4");
		obj[4]=new student(5,"ram5");
		for(int i=0;i<obj.length;i++) {
			obj[i].print();
		}
	}
	

}

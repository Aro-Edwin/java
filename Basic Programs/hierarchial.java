class shape{
	float length,radius,breath;
}
class rect extends shape{
	rect(float l,float b){
		length=l;
		breath=b;
	}
	float rect_area() {
		return length*breath;
	}
}
class circle extends shape{
	public circle(float r) {
		radius=r;
		System.out.println(+r);
	}
	float circle_area() {
		float m=3.14f * (radius*radius);
		return m;
	}
	
}
class square extends shape{
	public square(float l) {
		length=l;
		
	}
	float square_area() {
		return length*length;
	}	
	}
public class hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect obj1=new rect(2,5);
		circle obj2=new circle(5);
		square obj3=new square(3);
		System.out.println("rectangle area : "+obj1.rect_area());
		System.out.println("circle area : "+ obj2.circle_area());
		System.out.println("square area : "+obj3.square_area());
	}

}

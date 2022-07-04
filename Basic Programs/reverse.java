
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a=new StringBuilder("AROCKIA EDWIN A");
		System.out.println(a.length());
		System.out.println(a);
		System.out.println(a.reverse());
		StringBuilder b=new StringBuilder();
		for(int i=a.length()-1;i>=0;i--) {
			b.append(a.charAt(i));
			System.out.println(b);
		}

	}

}


public class varargs_method {
	public static void getnames(String... names) {
		for(String name:names){
		System.out.println(name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getnames("edwin","aro","kavi");
	}

}

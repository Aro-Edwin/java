
public class stringbufferandstringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("ARO");
		System.out.println(buffer);
		buffer.append(" A");//last la new add panna
		buffer.insert(4, "Edwin ");// new char insert panna
		buffer.replace(0, 3, "EDWIN");//replace function
		//buffer.delete(0, 5);//delete panna use akum
		buffer.setCharAt(0, '@');
		//buffer.reverse();//reverse panna use akum object
		System.out.println(buffer);
		StringBuilder build=new StringBuilder();
		System.out.println(build.capacity());
		

	}

}

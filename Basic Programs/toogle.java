
public class toogle {
	public static void main(String[] args) {
		//Learning Edwin From Youtube convert to lEARNING eDWIN fROM yOUTUBE
		StringBuilder a=new StringBuilder("Learning Edwin From Youtube");
		System.out.println("Before :"+a);
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=97&&a.charAt(i)<=122) {
				int b=(int) a.charAt(i)-32;
				a.setCharAt(i, (char)b);
			}
			else if(a.charAt(i)>=65&&a.charAt(i)<=90) {
				int c=(int)a.charAt(i)+32;
				a.setCharAt(i, (char)c);
			}
			
			
		}
			
		System.out.println("After : "+a);
	}
}

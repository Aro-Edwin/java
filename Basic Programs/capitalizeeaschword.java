
public class capitalizeeaschword {

	public static void main(String[] args) {
		// leArNinG edwIn ->Learning Edwin
		StringBuilder a=new StringBuilder("leArNinG edwIn");
		System.out.println("Before :"+a);
		if(a.charAt(0)>=97&&a.charAt(0)<=122) {
			int b=(int)a.charAt(0)-32;
			a.setCharAt(0,(char)b);
			//System.out.println(a);
		}
		for(int i=1;i<a.length();i++) {
			if(a.charAt(i)==32) {
				i++;
				if(a.charAt(i)>=97&&a.charAt(i)<=122) {
					int b=(int)a.charAt(i)-32;
					a.setCharAt(i,(char)b);
					//System.out.println(a);
					}
				}
			else {
					//System.out.println(i);
					//System.out.println(a.charAt(i));
					if(a.charAt(i)>=65 && a.charAt(i)<=90) {
						int b=(int)a.charAt(i)+32;
						a.setCharAt(i,(char)b);
						//System.out.println(a);
						}
					}
			}	
		System.out.println("After : "+a);

	}

}

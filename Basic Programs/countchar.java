
public class countchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder a=new StringBuilder("Aro-age is 21");
		System.out.println(a);
		int upper=0,lower=0,number=0,space=0,vowel=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>=97 && a.charAt(i)<=122){
				lower++;
			}
			if(a.charAt(i) >= 65 && a.charAt(i) <= 90) {
				upper=upper+1;
			}
			if(a.charAt(i)>=48 && a.charAt(i)<=57) {
				number++;
			}
			if(a.charAt(i) == 32) {
				space++;
			}
			if(a.charAt(i) =='A' ||a.charAt(i) =='E' ||a.charAt(i) =='I' ||a.charAt(i) =='O' ||a.charAt(i) =='U' ||a.charAt(i) =='a' ||a.charAt(i) =='e' ||a.charAt(i) =='i' ||a.charAt(i) =='o' ||a.charAt(i) =='u') {
				vowel++;
				
			}
		
		}
		System.out.println("Symol : "+(a.length()-(upper+lower+space+number)));
		System.out.println("Number : "+number);
		System.out.println("Lower Case Counter is :"+lower);
		System.out.println("upper Case Counter is :"+upper);
		System.out.println("Space Case Counter is :"+space);
		System.out.println("vowel Case Counter is :"+vowel);
	}

}

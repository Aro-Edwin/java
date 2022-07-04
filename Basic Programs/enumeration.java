
public class enumeration {
	enum gamelevel{
		LOW,
		MEDIUM,
		HIGH
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gamelevel a=gamelevel.LOW;
		System.out.println(a);
		
		switch(a) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;	
		}
		for(gamelevel list :gamelevel.values()) {
			System.out.println(list);
		}
		
		
		
	}

}

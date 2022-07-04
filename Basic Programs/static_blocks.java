class blocktest{
	static
	{
		System.out.println( "block-test-1");//3 run
	}
	static {
		System.out.println("block-test-2");// 4 run
	}
}
public class static_blocks {//static block menas automaic code runs
	static {
		System.out.println("Block-1----main class");//first run
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blocktest obj=new blocktest();//3 excute
			System.out.println("Main");// 5 run
			
		}
	static 
	{
		System.out.println("Block-2");// 2 run
	}

}

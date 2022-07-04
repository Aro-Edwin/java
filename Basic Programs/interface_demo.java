class phone{
	void voicecall(){
		System.out.println("Make a Voice Call");
	}
	void sms() {
		System.out.println("Send an sms");
	}
}
interface videocall {
	void video();
}
interface audioplayer{
	void audio();
}
class smartphone extends phone implements videocall,audioplayer{//multiple inheritace achived by interface

	@Override
	public void audio() {
		// TODO Auto-generated method stub
		System.out.println("You can make an Video call");
	}

	@Override
	public void video() {
		// TODO Auto-generated method stub
		System.out.println("You play Music");
		
	}
	
}
public class interface_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartphone obj=new smartphone();
		obj.voicecall();
		obj.sms();
		obj.video();
		obj.audio();

	}

}

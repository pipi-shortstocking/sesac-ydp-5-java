package _05_class._interface;

public class Speaker implements RemoteControl {
	// 필드
	private int volumn;
	
	@Override
	public void turnOn() {
		System.out.println("스피커 전원 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("스피커 전원 OFF");
	}

	@Override
	public void setVolumn(int volumn) {		
		if(volumn > RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		} else if(volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		} else {
			this.volumn = volumn;
		}
		
		System.out.println("현재 스피커 음량 : " + this.volumn);
	}
}

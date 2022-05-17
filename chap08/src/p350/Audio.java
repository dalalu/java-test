package p350;

public class Audio implements RemoteControl{
	
	private int volume;
	
	public void turnON() {
		System.out.println("TV를 켭니다.");
	}
	
	//turnOff() 추상 메소드의 실체 메소드
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//SetVolme() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨 :" + this.volume);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}



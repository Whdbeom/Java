package ch08.sec05;

public class Audio implements RemoteControl {

	private  int volume;

	@Override
	public void turnOn() {
			System.out.println("오디오 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 끔");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + volume);
	}
	
	//필드
	
	private int memoryVolume;

	// 디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		if(mute) {
		this.memoryVolume = this.volume;
		System.out.println("무음 처리");
		setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제");
			setVolume(this.memoryVolume);
		}
	}
	
	
	
}

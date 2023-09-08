package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone smartPhone = new SmartPhone("갤럭시", "은색");
		
		//Phone 으로부터 상속받은 필드 읽기
		System.out.println("모델 : " + smartPhone.model);
		System.out.println("색상 : " + smartPhone.color);
		
		
		//SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 : " + smartPhone.wifi);
		
		//Phone 으로부터 상속받은 메소드 호출
		smartPhone.bell();
		smartPhone.sendVoice("여보세요");
		smartPhone.receiveVoice("안녕하세요");
		smartPhone.sendVoice("넹");
		smartPhone.hangUp();
		
		//SmartPhone의 메소드 호출
		
		smartPhone.setWifi(true);
		
		smartPhone.internet();
	}

}

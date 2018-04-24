package polymorphism;

public class SamsungTV implements TV{
	
/*		
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}

	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리..");
	}
*/	
	
	//private SonySpeaker speaker;
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}

	//생성자 인젝션 - 생성자의 매개변수로 의존관계에 있는 객체의 주소 정보를 전달할 수 있다.
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}

	//다중 변수 매핑 - 생성자 인젝션에서 초기화할 멤버변수가 여러 개이면, 여러 개의 값을 한꺼번에 전달해야 함.
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}	

	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다. (가격 : " + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("SamsungTV---소리 올린다.");
		//speaker = new SonySpeaker();
		speaker.volumeUp();
	}

	public void volumeDown() {
		System.out.println("SamsungTV---소리 내린다.");
		//speaker = new SonySpeaker();
		speaker.volumeDown();
	}
}

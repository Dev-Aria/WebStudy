package polymorphism;

public class BeanFactory {

	public Object getBean(String beanName) {
		
		if (beanName.equals("samsung")) {
			System.out.println("Samsung TV");
			return new SamsungTV();
		} else if(beanName.equals("lg")) {
			System.out.println("Lg TV");
			return new LgTV();
		}
		
		return null;
	}
}

/*
	유지보수의 편리성을 위해 Factory 패턴을 적용한다.
	main()에서 사용할 객체 생성을 하나의 클래스화 한다.
*/
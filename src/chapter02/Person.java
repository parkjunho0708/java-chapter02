package chapter02;

public class Person {
	private String name;
	
//	public Person()
//	{
//		
//	}
	// 생성자를 하나라도 오버라이드 하면,
	// 컴파일러는 기본생성자를 호출하지 않는다.
	public Person(String name) {
		this.name = name;
		System.out.println("Person() called");
	}
}

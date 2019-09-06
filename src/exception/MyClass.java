package exception;

public class MyClass {
	// IOException을 던질 가능성이 있다는 것을 이 메소드를 사용하는 개발자에게 알려주는 것
	public void dangerMethod() throws MyException{ 
		System.out.println("normal state1");

		// 예외 상황 발생
		boolean isDanger = true;
		if (isDanger) {
			throw new MyException("MyException Occurs");
		}
		System.out.println("normal state2");
	}
}
